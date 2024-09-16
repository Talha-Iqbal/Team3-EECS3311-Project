

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.InvalidUserCredentialException;
import com.mycompany.team3.eecs3311.project.User;
import com.mycompany.team3.eecs3311.project.UserManager;
import com.mycompany.team3.eecs3311.project.UserType;

public class UserManagerTest {
	private final String email = "foo@Email";
	private final String password = "fooPassword!1";
	private final String name = "fooName";
	private final UserType type = UserType.STUDENT;
	private final String id = "5";

	private UserManager userManager = UserManager.getInstance();
	
	@Before
	public void setup() {
		userManager.removeUser(email, password);
	}
	
	@After
	public void tearDown() {
		userManager.removeUser(email, password);
	}
	
	@Test
	public void registerUser_NewUserIsAddedSuccessfully_UserExistsAt0thIndex() {
		try {
			userManager.registerUser(email, password, name, type, id, true);
			
			User registeredUser = userManager.getUserList().get(4);
			
			assertEquals(5, userManager.getUserList().size());
			assertEquals(email, registeredUser.getEmail());
			assertEquals(password, registeredUser.getPassword());
			assertEquals(name, registeredUser.getName());
			assertEquals("student", registeredUser.getTypeString());
			assertEquals(5, registeredUser.getId());
			
		} catch (InvalidUserCredentialException ex) {
			fail("New user with unique credentials should be able to be added");
		}
	}
	
	@Test (expected = InvalidUserCredentialException.class)
	public void registerUser_UserWithDuplicateEmailIsRejected_InvalidUserCredentialException() throws InvalidUserCredentialException {
		userManager.registerUser(email, password, name, type, id, true);
		userManager.registerUser(email, password, name, type, id, true);
		
		fail("Attempt to register user with email that is already tied to another user should throw InvalidUserCredentialException");
	}
	
	@Test
	public void loginUser_ExistingUserSuccessfullyLogins_CurrentUserIsTheUserThatAttempted() {
		try {
			userManager.registerUser(email, password, name, type, id, true);
			
			userManager.loginUser(email, password);
			
			User currentUser = userManager.getCurrentUser();
			
			assertEquals(email, currentUser.getEmail());
			assertEquals(password, currentUser.getPassword());
			assertEquals(name, currentUser.getName());
			assertEquals("student", currentUser.getTypeString());
			assertEquals(5, currentUser.getId());
			
		} catch (InvalidUserCredentialException ex) {
			fail("New user with unique credentials should be able to be added");
		}
	}
	
	@Test (expected = InvalidUserCredentialException.class) 
	public void loginUser_NonExistingUserIsRejected_InvalidUserCredentialException() throws InvalidUserCredentialException {
		userManager.loginUser(email, password);
		
		fail("Non-existing users should be rejected from login attempts.");
	}

}
