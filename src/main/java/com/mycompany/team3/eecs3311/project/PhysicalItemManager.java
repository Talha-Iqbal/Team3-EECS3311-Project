package com.mycompany.team3.eecs3311.project;

import java.io.FileWriter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class PhysicalItemManager {
	private Map<PhysicalItem, Integer> items;
	private int nextItemId = 1;
	
	private final String itemCsvDatabasePath = "./res/physical-items-database.csv";
	
	private static PhysicalItemManager physicalItemManager = null;
	
	public static PhysicalItemManager getInstance() {
		if (physicalItemManager == null) {
			physicalItemManager = new PhysicalItemManager();
		}
		
		return physicalItemManager;
	}
	
	private PhysicalItemManager() {
		this.items = new HashMap();
		
		initializeExistingItems();
	}
	
	private void initializeExistingItems() {
		try {
			load(itemCsvDatabasePath);
		} catch (Exception e) {
			ScreenManager.getInstance().showError("The item csv file database cannot be found");
		}
	}
	
	private void load(String path) throws Exception {
		CsvReader reader = new CsvReader(path);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			String title = reader.get("title");
			String author = reader.get("author");
			String id = reader.get("id");
			String location = reader.get("location");
			String isEnabled = reader.get("isEnabled");
			String isPurchasable = reader.get("isPurchasable");
			String itemType = reader.get("itemType");
			String stock = reader.get("stock");
			
			registerItem(title, author, id, location, isEnabled, isPurchasable, itemType, stock);
		}
	}
	
	private void update(String path) throws Exception {
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			csvOutput.write("title");
			csvOutput.write("author");
			csvOutput.write("id");
			csvOutput.write("location");
			csvOutput.write("isEnabled");
			csvOutput.write("isPurchasable");
			csvOutput.write("itemType");
			csvOutput.write("stock");
			csvOutput.endRecord();
			
			for (Map.Entry<PhysicalItem, Integer> entry : items.entrySet()) {
				PhysicalItem item = entry.getKey();
				csvOutput.write(item.getTitle());
				csvOutput.write(item.getAuthor());
				csvOutput.write(item.getIdString());
				csvOutput.write(item.getLocation());
				csvOutput.write(item.getEnableStatusCsv());
				csvOutput.write(item.getPurchaseStatusCsv());
				csvOutput.write(item.getItemTypeString());
				csvOutput.write(String.valueOf(entry.getValue()));
				csvOutput.endRecord();
			}
			
			csvOutput.close();
		} catch (Exception e) {
			ScreenManager.getInstance().showError("Writing to physical items csv failed.");
		}
		
	}
	

	private void registerItem(
			String title,
			String author,
			String id, 
			String location, 
			String isEnabled, 
			String isPurchasable,
			String itemType, 
			String stock) {
		
		int uniqueItemId = Integer.parseInt(id);
		boolean enabled = Boolean.parseBoolean(isEnabled);
		boolean purchasable = Boolean.parseBoolean(isPurchasable);
		ItemType type = ItemType.parseItemType(itemType);
		int itemStock = Integer.parseInt(stock);
		
		PhysicalItem itemInstance = 
				new PhysicalItem(
						title,
						author,
						uniqueItemId,
						location,
						enabled,
						purchasable, 
						type);
		
		items.put(itemInstance, itemStock);
		nextItemId = uniqueItemId + 1;
	}
	
	public PhysicalItem searchForItem(String itemTitle) throws ItemDoesNotExistException{
		String sanitizedItemTitle = itemTitle.toLowerCase().trim();
		
		for (Map.Entry<PhysicalItem, Integer> entry : items.entrySet()) {
			PhysicalItem item = entry.getKey();
			
			if (item.getTitle().equals(sanitizedItemTitle)) { 
				return item.clone(); // borrowed date is null, method is used for initial search of items. Clone excludes clone of borrowed date
			}
		}
		
		throw new ItemDoesNotExistException("The item you are looking for does not exist");
	}
	
	public void addItem(PhysicalItem item, int stock) { // for testing purposes
		items.put(item, stock);
	}
	
	public void removeItem(PhysicalItem item) { // for testing purposes
		items.remove(item);
	}
	
	public int getItemStock(String itemTitle) throws ItemDoesNotExistException {
		String sanitizedItemTitle = itemTitle.toLowerCase().trim();
		
		for (Map.Entry<PhysicalItem, Integer> entry : items.entrySet()) {
			PhysicalItem item = entry.getKey();
			
			if (item.getTitle().equals(sanitizedItemTitle)) {
				return entry.getValue();
			}
		}
		
		throw new ItemDoesNotExistException("Failed to get item stock: Could not find item in database");
	}
	
	public void rentItem(String itemTitle, PhysicalItemWindow itemWindow, boolean isTest) throws ItemNotInStockException {		
		for (Map.Entry<PhysicalItem, Integer> entry : items.entrySet()) {
			PhysicalItem item = entry.getKey();
			
			boolean itemExistsInRecords = item.getTitle().equalsIgnoreCase(itemTitle.trim());
			boolean itemInStock = entry.getValue() > 0;
			
			if (itemExistsInRecords && itemInStock) {
				try {
					User currentUser = UserManager.getInstance().getCurrentUser();
					Calendar currentDate = DateManager.getInstance().getDate(); 
					
					currentUser.addItem(item.clone(), currentDate);
					
					if (!isTest) {
						int oldStock = entry.getValue();
						entry.setValue(oldStock - 1);
					
						ScreenManager.getInstance().refreshItemWindow(itemWindow);
					
						update(itemCsvDatabasePath);
					}
				
				} catch (LostBorrowingPrivilegeException e){
					if (!isTest) {
						ScreenManager.getInstance().showError(e.getMessage());
					}
				} catch (Exception e) {
					if (!isTest) {
						ScreenManager.getInstance().showError("The item csv file database cannot be found");
					}
				}
				
				return;
			} 
		}
		
		throw new ItemNotInStockException("Failed to rent item: out of stock.");
	}
}
