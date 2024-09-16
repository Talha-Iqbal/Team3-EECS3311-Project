package com.mycompany.team3.eecs3311.project;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUserCommand implements Command {
	JTextField emailField;
	JPasswordField passwordField;
	
	public LoginUserCommand(JTextField emailField, JPasswordField passwordField) {
		this.emailField = emailField;
		this.passwordField = passwordField;
	}
	
	@Override
	public void execute() {
		SystemUtilities.getInstance().loginUser(emailField.getText(), new String(passwordField.getPassword()));
	}

}
