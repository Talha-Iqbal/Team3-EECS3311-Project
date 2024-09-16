

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.Faculty;
import com.mycompany.team3.eecs3311.project.ItemType;
import com.mycompany.team3.eecs3311.project.LostBorrowingPrivilegeException;
import com.mycompany.team3.eecs3311.project.PhysicalItem;
import com.mycompany.team3.eecs3311.project.UserType;

public class FacultyTest {
	private Faculty faculty;
	private String email;
	private String password;
	private String name;
	private UserType type;
	private int id;
	private PhysicalItem item;
	private Calendar borrowedDate;
	private final int maxCapacity = 10;
	
	@Before
	public void setup() {
		email = "foo@bar.ca";
		password = "Foopassword1!";
		name = "foo";
		type = UserType.FACULTY_MEMBER;
		id = 50;
		
		faculty = new Faculty(email, password, name, type, id);
		item = new PhysicalItem("fooTitle", "fooAuthor", 10, "fooLocation", true, false, ItemType.BOOK);
		borrowedDate = new Calendar.Builder().setDate(2024, Calendar.MARCH, 10).build();
	}
	
	
	@Test
	public void getEmail_EmailPassedInConstructorIsStored_foobarca() {
		assertEquals("foo@bar.ca", faculty.getEmail());
	}
	
	@Test
	public void getPassword_PasswordPassedInConstructorIsStored_Foopassword1(){
		assertEquals("Foopassword1!", faculty.getPassword());
	}
	
	@Test
	public void getName_NamePassedInConstructorIsStored_foo() {
		assertEquals("foo", faculty.getName());
	}
	
	@Test
	public void getTypeString_UserTypeIsParsedAsCorrectString_faculty() {
		assertEquals("faculty", faculty.getTypeString());
	}
	
	@Test
	public void getId_IdPassedInConstructorIsStored_50() {
		assertEquals(50, faculty.getId());
	}
	
	@Test
	public void addItem_NewRentedItemCanBeStored_0thIndexInListHasItem() {
		try {
			faculty.addItem(item, borrowedDate);
			
			assertSame(item, faculty.getRentedItems().get(0));
		} catch (LostBorrowingPrivilegeException ex) {
			fail("The faculty should not have reached max capacity of 10 borrowed items");
		}
	}
	
	@Test(expected = LostBorrowingPrivilegeException.class)
	public void addItem_ExceptionShouldBeThrownWhenExceedingMaxCapacity_LostBorrowingPrivilegeExceptionThrown() throws LostBorrowingPrivilegeException{
		for (int i = 0; i < maxCapacity; i++) {
			item = new PhysicalItem("fooTitle", "fooAuthor", i, "fooLocation", true, false, ItemType.BOOK);
			faculty.addItem(item, borrowedDate);
		}
		
		item = new PhysicalItem("fooTitle", "fooAuthor", 999, "fooLocation", true, false, ItemType.BOOK);
		faculty.addItem(item, borrowedDate);
		
		fail("LostBorrowingPrivilegeException should be thrown when user exceeds max capacity when borrowing items");
	}
	

}
