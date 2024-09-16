

import static org.junit.Assert.assertEquals;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.LoginUserCommand;
import com.mycompany.team3.eecs3311.project.User;
import com.mycompany.team3.eecs3311.project.UserManager;

public class LoginUserCommandTest {
	private JTextField emailField;
	private JPasswordField passwordField;
	private LoginUserCommand loginUserCommand;
	private UserManager userManager;
	
	@Before
	public void setup() {
		emailField = new JTextField("foo@yorku.ca");
		passwordField = new JPasswordField("Foo123!");
		userManager = UserManager.getInstance();
		
		loginUserCommand = new LoginUserCommand(emailField, passwordField);
	}

	@Test
	public void execute_UserLoginsSuccessfully_CurrentUserIsFooyorkuca() {
		loginUserCommand.execute();
		
		User currentUser = userManager.getCurrentUser();
		
		assertEquals(emailField.getText(), currentUser.getEmail());
		assertEquals(String.valueOf(currentUser.getPassword()), currentUser.getPassword());
	}

}
