package com.mycompany.team3.eecs3311.project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends BaseWindow implements Screen{
	private GridBagLayout mainLayout;
	private GridBagConstraints mainLayoutConstraints;
	
	private JPanel mainPanel;
	private JPanel emailPanel;
	private JPanel passwordPanel;
	private JPanel buttonPanel;
	
	private JLabel emailFieldPrompt;
	private JLabel passwordFieldPrompt;
	
	private JTextField emailField;
	private JPasswordField passwordField;
	
	private Button loginButton;
	private Button registerButton;
	
	private final int visibleEmailCharacterLimit = 30;
	private final int visiblePasswordCharacterLimit = 30;
	
	public LoginWindow() {
		super("YorkU Library Management App - Login");
		mainLayout = new GridBagLayout();
		mainLayoutConstraints = new GridBagConstraints();
		
		mainPanel = new JPanel(mainLayout);
		emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 35, 0));
		passwordPanel = new JPanel();
		buttonPanel = new JPanel();
		
		emailFieldPrompt = new JLabel("Email");
		emailField = new JTextField(visibleEmailCharacterLimit);
		emailPanel.add(emailFieldPrompt);
		emailPanel.add(emailField);
		
		passwordFieldPrompt = new JLabel("Password");
		passwordField = new JPasswordField(visiblePasswordCharacterLimit);
		passwordPanel.add(passwordFieldPrompt);
		passwordPanel.add(passwordField);
		
		loginButton = new Button("Login");
		loginButton.setCommand(new LoginUserCommand(emailField, passwordField));
		loginButton.setActionEventListener();
		registerButton = new Button("New User");
		registerButton.setCommand(new ScreenSwitchCommand(ScreenType.LOGIN, ScreenType.REGISTER));
		registerButton.setActionEventListener();
		buttonPanel.add(loginButton);
		buttonPanel.add(registerButton);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 0;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(emailPanel, mainLayoutConstraints);
		mainPanel.add(emailPanel);

		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 1;
		mainLayoutConstraints.gridwidth = 3;
		mainLayoutConstraints.gridheight = 1;
		mainLayoutConstraints.anchor = GridBagConstraints.CENTER;
		mainLayout.setConstraints(passwordPanel, mainLayoutConstraints);
		mainPanel.add(passwordPanel);
		
		mainLayoutConstraints.gridx = 0;
		mainLayoutConstraints.gridy = 2;
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
		this.emailField.setText("");
		this.passwordField.setText(""); 
		
	}
	
	
}
