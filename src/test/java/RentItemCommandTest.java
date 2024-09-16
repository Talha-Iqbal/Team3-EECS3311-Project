import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.InvalidUserCredentialException;
import com.mycompany.team3.eecs3311.project.ItemType;
import com.mycompany.team3.eecs3311.project.PhysicalItem;
import com.mycompany.team3.eecs3311.project.PhysicalItemManager;
import com.mycompany.team3.eecs3311.project.PhysicalItemWindow;
import com.mycompany.team3.eecs3311.project.RentItemCommand;
import com.mycompany.team3.eecs3311.project.UserManager;
import com.mycompany.team3.eecs3311.project.UserType;

public class RentItemCommandTest {
	private final String email = "bar@email.com";
	private final String password = "barYorkPassword1!";
	private final String name = "barName";
	private final UserType userType = UserType.STUDENT;
	private final String id = "10";
	
	private final String itemTitle = "fooitemtitle";
	private final String itemAuthor = "fooItemAuthor";
	private final int itemId = 50;
	private final String location = "fooLocation";
	private final boolean isEnabled = true;
	private final boolean isPurchasable = false;
	private final ItemType itemType = ItemType.CD;
	
	private final boolean isTest = true;
	
	private PhysicalItemWindow itemWindow;
	private PhysicalItem item;
	
	private UserManager userManager;
	private PhysicalItemManager physicalItemManager;

	private RentItemCommand command;


	@Before
	public void setup() {
		userManager = UserManager.getInstance();
		userManager.removeUser(email, password);
		try {
			userManager.registerUser(email, password, name, userType, id, true);
			userManager.loginUser(email, password);
		} catch (InvalidUserCredentialException ex) {
			fail("New user should be able to be registered and login");
		}
		
		item = new PhysicalItem(
				itemTitle,
				itemAuthor,
				itemId,
				location,
				isEnabled,
				isPurchasable,
				itemType);
		physicalItemManager = PhysicalItemManager.getInstance();
		physicalItemManager.addItem(item, 20);
		
		itemWindow = new PhysicalItemWindow(item);

		command = new RentItemCommand(itemTitle, itemWindow, isTest);	
	}
	
	@After
	public void tearDown() {
		userManager.removeUser(email, password);
		physicalItemManager.removeItem(item);
	}


    @Test
    public void execute_ItemIsAddedToUserRentedInventory_true() {
    	command.execute();
    	
    	List<PhysicalItem> rentedItems = userManager.getCurrentUser().getRentedItems();
    	boolean isItemExists = false;
    	
    	for(PhysicalItem item : rentedItems) {
    		if (!isItemExists 
    				&& item.getTitle().equals(itemTitle)
    				&& item.getAuthor().equals(itemAuthor)
    				&& item.getIdString().equals(String.valueOf(itemId))) {
    			isItemExists = true;
    		}
    	}
    	
    	assertTrue(isItemExists);
    }
}
