package com.mycompany.team3.eecs3311.project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterWindow extends BaseWindow implements Screen{
	private GridBagLayout mainLayout;
	private GridBagConstraints mainLayoutConstraints;
	
	private JPanel mainPanel;
	private JPanel namePanel;
	private JPanel emailPanel;
	private JPanel passwordPanel;
	private JPanel userTypePanel;
	private JPanel idPanel;
	private JPanel buttonPanel;
	
	private JLabel namePrompt;
	private JLabel emailFieldPrompt;
	private JLabel passwordFieldPrompt;
	private JLabel userTypePrompt;
	private JLabel idPrompt;
	
	private JTextField nameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JTextField idField;
	private JComboBox<UserType> userTypeSelect;
	
	private Button registerButton;
	private Button goBackButton;
	
	private final int visibleCharacterLimit = 30;
	
	public RegisterWindow() {
		super("YorkU Library Management App - Register");
		mainLayout = new GridBagLayout();
		mainLayoutConstraints = new GridBagConstraints();
		
		mainPanel = new JPanel(mainLayout);
		namePanel = new JPanel();
		emailPanel = new JPanel();
		passwordPanel = new JPanel();
		userTypePanel = new JPanel();
		idPanel = new JPanel();
		buttonPanel = new JPanel();
		
		namePrompt = new JLabel("Name");
		nameField = new JTextField(visibleCharacterLimit);
		namePanel.add(namePrompt);
		namePanel.add(nameField);
		
		
		emailFieldPrompt = new JLabel("Email");
		emailField = new JTextField(visibleCharacterLimit);
		emailPanel.add(emailFieldPrompt);
		emailPanel.add(emailField);
		
		passwordFieldPrompt = new JLabel("Password");
		passwordField = new JPasswordField(visibleCharacterLimit);
		passwordPanel.add(passwordFieldPrompt);
		passwordPanel.add(passwordField);
		
		idPrompt = new JLabel("ID (if applicable, student, faculty or non-faculty):");
		idField = new JTextField(visibleCharacterLimit);
		idPanel.add(idPrompt);
		idPanel.add(idField);
		idPanel.setPreferredSize(new Dimension(500, 50));
		
		userTypePrompt = new JLabel("User Type");
		userTypeSelect = new JComboBox<UserType>();
		userTypeSelect.addItem(UserType.VISITOR);
		userTypeSelect.addItem(UserType.STUDENT);
		userTypeSelect.addItem(UserType.NON_FACULTY);
		userTypeSelect.addItem(UserType.FACULTY_MEMBER);
		userTypeSelect.setSelectedItem(UserType.VISITOR);
		userTypePanel.add(userTypePrompt);
		userTypePanel.add(userTypeSelect);
	
		registerButton = new Button("Register");
		registerButton.setCommand(new RegisterUserCommand(nameField, emailField, passwordField, userTypeSelect, idField, false));
		registerButton.setActionEventListener();
		
		goBackButton = new Button("Go Back");
		goBackButton.setCommand(new ScreenSwitchCommand(ScreenType.REGISTER, ScreenType.LOGIN));
		goBackButton.setActionEventListener();
		buttonPanel.add(registerButton);
		buttonPanel.add(goBackButton);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 0;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(namePanel, mainLayoutConstraints);
		mainPanel.add(namePanel);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 1;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(emailPanel, mainLayoutConstraints);
		mainPanel.add(emailPanel);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 2;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(passwordPanel, mainLayoutConstraints);
		mainPanel.add(passwordPanel);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 3;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(idPanel, mainLayoutConstraints);
		mainPanel.add(idPanel);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 4;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(userTypePanel, mainLayoutConstraints);
		mainPanel.add(userTypePanel);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 5;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(buttonPanel, mainLayoutConstraints);
		mainPanel.add(buttonPanel);
		
		window.add(mainPanel, BorderLayout.CENTER);
	}
	
	@Override
	public void show() {
		window.setVisible(true);
	}

	@Override
	public void unshow() {
		window.setVisible(false);
	}
	
	@Override
	public void clearFields() {
		nameField.setText("");
		emailField.setText("");
		passwordField.setText("");
		userTypeSelect.setSelectedItem(UserType.FACULTY_MEMBER);
		idField.setText("");
	}
}
