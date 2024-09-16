

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.InvalidUserCredentialException;
import com.mycompany.team3.eecs3311.project.RegisterUserCommand;
import com.mycompany.team3.eecs3311.project.User;
import com.mycompany.team3.eecs3311.project.UserManager;
import com.mycompany.team3.eecs3311.project.UserType;

public class RegisterUserCommandTest {
	private JTextField nameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JComboBox<UserType> userTypeSelect;
	private JTextField idField;
	private boolean isTest;

	private RegisterUserCommand registerUserCommand;
	
	private UserManager userManager;
	
	@Before
	public void setup() {
		userManager = UserManager.getInstance();
		userManager.removeUser("Bob@yorku.ca", "Bob123!");
		
		nameField = new JTextField("Bob");
		emailField = new JTextField("Bob@yorku.ca");
		passwordField = new JPasswordField("Bob123!");
		userTypeSelect = new JComboBox<UserType>();
		userTypeSelect.addItem(UserType.STUDENT);
		userTypeSelect.setSelectedItem(UserType.STUDENT);
		idField = new JTextField("50");
		isTest = true;
		
		registerUserCommand = new RegisterUserCommand(nameField, emailField, passwordField, userTypeSelect, idField, isTest);
	}
	
	@After
	public void tearDown() {
		userManager.removeUser("Bob@yorku.ca", "Bob123!");
	}
	
	@Test
	public void execute_UserSuccessfullyRegisters_BobUser() {
		registerUserCommand.execute();
		
		try {
			userManager.loginUser(emailField.getText(), String.valueOf(passwordField.getPassword()));
		} catch (InvalidUserCredentialException e) {
			fail("Newly registered user should be able to login.");
		}
		
		User currentUser = userManager.getCurrentUser();
		
		assertEquals(emailField.getText(), currentUser.getEmail());
		assertEquals(nameField.getText(), currentUser.getName());
		assertEquals("student", currentUser.getTypeString());
		assertEquals(Integer.parseInt(idField.getText()), currentUser.getId());		
	}

}
