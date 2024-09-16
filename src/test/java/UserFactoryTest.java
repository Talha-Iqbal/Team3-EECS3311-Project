

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.Faculty;
import com.mycompany.team3.eecs3311.project.InvalidUserCredentialException;
import com.mycompany.team3.eecs3311.project.Student;
import com.mycompany.team3.eecs3311.project.User;
import com.mycompany.team3.eecs3311.project.UserFactory;
import com.mycompany.team3.eecs3311.project.UserType;

public class UserFactoryTest {
	private final String email = "foo@Email";
	private final String password = "fooPassword1@";
	private final String name = "fooName";
	private final UserType userType = UserType.STUDENT;
	private final String id = "5";
	
	public UserFactory userFactory;
	
	@Before
	public void setup() {
		userFactory = new UserFactory();
	}

	@Test (expected = InvalidUserCredentialException.class)
	public void getUser_InvalidEmailIsRejected_InvalidUserCredentialException() throws InvalidUserCredentialException{
		userFactory.getUser("foo", password, name, userType, id);
		
		fail("Invalid emails (i.e. emails without an @) should throw an InvalidUserCredentialException");
	}
	
	@Test (expected = InvalidUserCredentialException.class)
	public void getUser_InvalidPasswordIsRejected_InvalidUserCredentialException() throws InvalidUserCredentialException {
		userFactory.getUser(email, "", name, userType, id);
		userFactory.getUser(email, "bad", name, userType, id);
		userFactory.getUser(email, "Bad", name, userType, id);
		userFactory.getUser(email, "B@d", name, userType, id);
		userFactory.getUser(email, "Bad1", name, userType, id);
		
		fail("Invalid passwords (i.e. passwords without at least an uppercase, lowercase, special symbol, and number) should thrown an InvalidUserCredentialException");
	}
	
	@Test (expected = InvalidUserCredentialException.class) 
	public void getUser_InvalidIdIsRejected_InvalidUserCredentialException() throws InvalidUserCredentialException {
		userFactory.getUser(email, password, name, userType, "hello");
		userFactory.getUser(email, password, name, userType, "-1");
		
		fail("Invalid IDs (i.e. non-numeric IDs are ids not within range of 0 - 1000) should throw InvalidUserCredentialException");
	}
	
	@Test
	public void getUser_ValidUserIsCreated_CorrectUserSubclass() {
		try {
			User student = userFactory.getUser(email, password, name, UserType.STUDENT, id);
			User faculty = userFactory.getUser(email, password, name, UserType.FACULTY_MEMBER, id);
			User non_faculty = userFactory.getUser(email, password, name, UserType.NON_FACULTY, id);
			User visitor = userFactory.getUser(email, password, name, UserType.VISITOR, id);
			
			assertTrue(student instanceof Student);
			assertTrue(faculty instanceof Faculty);
			assertTrue(non_faculty instanceof User);
			assertTrue(visitor instanceof User);
			
		} catch (InvalidUserCredentialException ex) {
			fail(ex.getMessage());
		}
		
		
	}

}
