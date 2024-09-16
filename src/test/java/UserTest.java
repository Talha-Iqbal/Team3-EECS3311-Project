

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.ItemType;
import com.mycompany.team3.eecs3311.project.LostBorrowingPrivilegeException;
import com.mycompany.team3.eecs3311.project.PhysicalItem;
import com.mycompany.team3.eecs3311.project.User;
import com.mycompany.team3.eecs3311.project.UserType;

public class UserTest {
	private final String email = "fooEmail";
	private final String password = "fooPassword";
	private final String name = "fooName";
	private final UserType userType = UserType.STUDENT;
	private final int id = 5;
	
	private User user;
	private PhysicalItem item;
	private Calendar date;
	
	@Before
	public void setup() {
		user = new User(email, password, name, userType, id);
		item = new PhysicalItem("fooTitle", "fooAuthor", 10, "fooLocation", true, true, ItemType.BOOK);
		date = new Calendar.Builder().setDate(2024, Calendar.MARCH, 1).build();
	}
	
	@Test
	public void getEmail_initializedEmailIsStored_fooEmail() {
		assertEquals(email, user.getEmail());
	}
	
	@Test
	public void getPassword_initializedPasswordIsStored_fooPassword() {
		assertEquals(password, user.getPassword());
	}
	
	@Test
	public void getName_initializedNameIsStored_fooName() {
		assertEquals(name, user.getName());
	}
	
	@Test
	public void getTypeString_equivalentTypeStringIsGenerated_correctTypeString() {
		user = new User(email, password, name, UserType.FACULTY_MEMBER, id);
		assertEquals("faculty", user.getTypeString());
		
		user = new User(email, password, name, UserType.STUDENT, id);
		assertEquals("student", user.getTypeString());
		
		user = new User(email, password, name, UserType.NON_FACULTY, id);
		assertEquals("non_faculty", user.getTypeString());
		
		user = new User(email, password, name, UserType.VISITOR, id);
		assertEquals("visitor", user.getTypeString());
	}
	
	@Test
	public void getId_initializedIdIsStored_5() {
		assertEquals(id, user.getId());
	}
	
	@Test
	public void addItem_ItemSuccessfullyAdded_itemIn0thIndex() {
		try {
			user.addItem(item, date);
			assertEquals(item, user.getRentedItems().get(0));
		} catch (LostBorrowingPrivilegeException ex) {
			fail("User should be able to add items when they are below borrowing limit threshold");
		}
	}
	
	@Test (expected = LostBorrowingPrivilegeException.class)
	public void addItem_ItemUnsuccessfullyAddedToFullList_LostBorrowingPrivilegeException() throws LostBorrowingPrivilegeException {
		for (int i = 0; i < 10; i++) {
			user.addItem(item, date);
		}
		
		user.addItem(item, date);
		fail("LostBorrowingPrivilegeException should be thrown when adding to full list.");
	}
	
	@Test
	public void getRentedItems_InitializedItemListIsStored_emptyList() {
		assertTrue(user.getRentedItems() instanceof List);
		assertEquals(0, user.getRentedItems().size());
	}
}
