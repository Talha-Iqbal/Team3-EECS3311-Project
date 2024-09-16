package com.mycompany.team3.eecs3311.project;

import java.util.Calendar;

public class PhysicalItem{
	private String title;
	private String author;
	private int id;
	private String location;
	private boolean isEnabled;
	private boolean isPurchasable;
	private ItemType type;
	private int yearOfBorrow;
	private int monthOfBorrow;
	private int dayOfBorrow;
	
	public PhysicalItem(
			String title,
			String author,
			int id,
			String location,
			boolean isEnabled,
			boolean isPurchasable,
			ItemType type) {
		
		this.title = title;
		this.author = author;
		this.id = id;
		this.location = location;
		this.isEnabled = isEnabled;
		this.isPurchasable = isPurchasable;
		this.type = type;
		yearOfBorrow = -1; //Not been borrowed yet
		monthOfBorrow = -1;
		dayOfBorrow = -1;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getIdString() {
		return String.valueOf(id);
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public boolean getEnableStatus() {
		return this.isEnabled;
	}
	
	public boolean getPurchasableStatus() {
		return this.isPurchasable;
	}
	
	public String getEnableStatusCsv() {
		if (isEnabled) {
			return "TRUE";
		}
		
		return "FALSE";
	}
	
	public String getEnableStatusDisplay() {
		if (isEnabled) {
			return "yes";
		} 
		
		return "no";
	}
	
	public String getPurchaseStatusCsv() {
		if (isPurchasable) {
			return "TRUE";
		}
		
		return "FALSE";
	}
	
	public String getPurchaseStatusDisplay() {
		if (isPurchasable) {
			return "yes";
		}
		
		return "no";
	}
	
	public String getItemTypeString() {
		return ItemType.parseString(type);
	}
	
	public PhysicalItem clone() {
		String titleCopy = new String(this.title);
		String authorCopy = new String(this.author);
		int idCopy = this.id;
		String locationCopy = new String(this.location);
		boolean isEnabledCopy = this.isEnabled;
		boolean isPurchasableCopy = this.isPurchasable;
		ItemType typeCopy = this.type;

		
		PhysicalItem clone = new PhysicalItem(
					titleCopy,
					authorCopy,
					idCopy,
					locationCopy,
					isEnabledCopy,
					isPurchasableCopy,
					typeCopy);
		
		return clone;
	}
	
	public void setDateBorrowed(Calendar date) {
		this.yearOfBorrow = date.get(Calendar.YEAR);
		this.monthOfBorrow = date.get(Calendar.MONTH);
		this.dayOfBorrow = date.get(Calendar.DAY_OF_MONTH);
	}
	
	public Calendar getDateBorrowed() {
		return new Calendar.Builder().setDate(yearOfBorrow, monthOfBorrow, dayOfBorrow).build();
	}
	
	public String getDateBorrowedString() {
		return SystemUtilities.getInstance().formatCurrentDateString(getDateBorrowed());
	}
	
	public String getDueDateString() {
		Calendar borrowedDate = new Calendar.Builder().setDate(yearOfBorrow, monthOfBorrow, dayOfBorrow).build();
		return SystemUtilities.getInstance().formatDueDateString(borrowedDate);
	}
}
