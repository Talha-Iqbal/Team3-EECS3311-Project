package com.mycompany.team3.eecs3311.project;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterUserCommand implements Command {
	private JTextField nameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JComboBox<UserType> userTypeSelect;
	private JTextField idField;
	private boolean isTest;
	
	public RegisterUserCommand(
			JTextField nameField,
			JTextField emailField,
			JPasswordField passwordField,
			JComboBox<UserType> userTypeSelect,
			JTextField idField,
			boolean isTest) {
		this.nameField = nameField;
		this.emailField = emailField;
		this.passwordField = passwordField;
		this.userTypeSelect = userTypeSelect;
		this.idField = idField;
		this.isTest = isTest;
	}

	@Override
	public void execute() {
		SystemUtilities
			.getInstance()
			.registerUser(
					emailField.getText(),
					new String(passwordField.getPassword()),
					nameField.getText(),
					(UserType) userTypeSelect.getSelectedItem(),
					idField.getText(),
					isTest);
	}

}
