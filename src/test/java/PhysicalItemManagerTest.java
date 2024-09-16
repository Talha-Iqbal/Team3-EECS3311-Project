
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.InvalidUserCredentialException;
import com.mycompany.team3.eecs3311.project.ItemDoesNotExistException;
import com.mycompany.team3.eecs3311.project.ItemNotInStockException;
import com.mycompany.team3.eecs3311.project.ItemType;
import com.mycompany.team3.eecs3311.project.PhysicalItem;
import com.mycompany.team3.eecs3311.project.PhysicalItemManager;
import com.mycompany.team3.eecs3311.project.PhysicalItemWindow;
import com.mycompany.team3.eecs3311.project.User;
import com.mycompany.team3.eecs3311.project.UserManager;
import com.mycompany.team3.eecs3311.project.UserType;

public class PhysicalItemManagerTest {
	PhysicalItemManager physicalItemManager;
	PhysicalItem item;
	
	private final String title = "fooTitle";
	private final String author = "fooAuthor";
	private final int id = 1;
	private final String location = "fooLocation";
	private final boolean isEnabled = true;
	private final boolean isPurchaseable = false;
	private final ItemType itemtype = ItemType.BOOK;
	
	private final String email = "bar@email.ca";
	private final String password = "Barpassword1!";
	private final String name ="barName";
	private final UserType userType = UserType.STUDENT;
	private final String userID = "20";

    @Before
	public void setup() {
    	physicalItemManager = PhysicalItemManager.getInstance();
    	item = new PhysicalItem(
  			      title, 
			      author, 
				  id, 
				  location, 
				  isEnabled, 
				  isPurchaseable, 
				  itemtype);
    	
  	}
    
    @After
    public void tearDown() {
		 UserManager.getInstance().removeUser("bar@email.ca", "Barpassword1!");
		 physicalItemManager.removeItem(item);
		 
    }

    @Test
    public void searchForItem_SearchingForExistingItem_forbesmagazine() throws ItemDoesNotExistException {
    	try {
    		assertEquals("forbes magazine", physicalItemManager.searchForItem("forbes magazine").getTitle());
    		
    	} catch (ItemDoesNotExistException ex) {
    		fail("Item should be found");
    	}
    }

    @Test (expected = ItemDoesNotExistException.class)
    public void searchForItem_SearchingForNonExistingItem_ItemDoesNotExistException() throws ItemDoesNotExistException {
    	physicalItemManager.searchForItem("non existing item");
    	
    	fail("Item not in system should not be found");
    	
    }

    @Test
    public void getItemStock_GettingStockOfExistingItem_20() throws ItemDoesNotExistException {
    	
    	try { 
    		assertEquals(20, physicalItemManager.getItemStock("forbes magazine"));
    		
    	} catch (ItemDoesNotExistException ex){
    		fail("item in system should be found");
    	}
    	
    }
    
    @Test (expected = ItemDoesNotExistException.class)
    public void getItemStock_GettingStockForNonExistingItems_ItemDoesNotExistException() throws ItemDoesNotExistException {
    	physicalItemManager.getItemStock("non-existing Item");
    	
    	fail("Item Not in the system should not be found");	
    	
    }
      
    @Test
    public void rentItem_RentingAnItemIsSuccessful_ItemInUsersInventory(){
    	 try {

    		 UserManager.getInstance().registerUser(email, password, name, userType, userID, true);
        	 UserManager.getInstance().loginUser(email, password);

        	 physicalItemManager.addItem(item, 20);
        	 PhysicalItemWindow itemWindow = new PhysicalItemWindow(item);
    		 physicalItemManager.rentItem("fooTitle", itemWindow, true);
    		 
    		 User currentUser = UserManager.getInstance().getCurrentUser();
    		 List<PhysicalItem> currentItems = currentUser.getRentedItems();
    		 
    		 assertTrue(currentItems.size() == 1);
    		 assertEquals("fooTitle", currentItems.get(0).getTitle());
    		 assertEquals("fooAuthor", currentItems.get(0).getAuthor());
    		 assertEquals("1",currentItems.get(0).getIdString());
    	 	     		 
    	 } catch (ItemNotInStockException ex) {
    		fail("item should exist"); 
    	 } catch (InvalidUserCredentialException ex) {
    		 fail("New users should be able to register and log in");
    	 }
    }
    
    @Test (expected = ItemNotInStockException.class)
    public void rentItem_RentingOutOfStockItemFails_ItemNotInStockException() throws ItemNotInStockException {
    	try {
    		UserManager.getInstance().registerUser(email, password, name, userType, userID, true);
    		UserManager.getInstance().loginUser(email, password);
    	} catch (InvalidUserCredentialException ex){
    		fail("New users should be able to register and log in");
    	}
        	 
    	physicalItemManager.addItem(item, 0);
    	PhysicalItemWindow itemWindow = new PhysicalItemWindow(item);
    	physicalItemManager.rentItem("fooTitle", itemWindow, true);

    	fail("Out of stock items should not be rentable"); 
    }
}