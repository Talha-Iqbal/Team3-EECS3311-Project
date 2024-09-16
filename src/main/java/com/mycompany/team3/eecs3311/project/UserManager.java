package com.mycompany.team3.eecs3311.project;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class UserManager {
	private List<User> users;
	private UserFactory userFactory;
	private User currentUser;
	
	private final String userCsvDatabasePath = "./res/user-database.csv";
	
	private static UserManager userManager = null;
	
	public static UserManager getInstance() {
		if (userManager == null) {
			userManager = new UserManager();
		}
		
		return userManager;
	}
	
	private UserManager() {
		this.users = new ArrayList<>();
		this.userFactory = new UserFactory();
		
		initializeExistingUsers();
	}
	
	private void initializeExistingUsers() {
		try {
			load(userCsvDatabasePath);
		} catch (Exception e) {
			ScreenManager.getInstance().showError("The user csv file database cannot be found");
		}
	}
	
	private void load(String path) throws Exception {
		CsvReader reader = new CsvReader(path);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			String name = reader.get("name");
			String id = reader.get("id");
			String email = reader.get("email");
			String password = reader.get("password");
			String type = reader.get("type");
			
			UserType userType = determineUserType(type);
			registerUser(email, password, name, userType, id, false);
		}
	}
	
	private UserType determineUserType(String type) {
		String sanitizedType = type.toLowerCase().trim();
		
		if (sanitizedType.equals("faculty")) {
			return UserType.FACULTY_MEMBER;
		} else if (sanitizedType.equals("student" )) {
			return UserType.STUDENT;
		} else if (sanitizedType.equals("non_faculty")) {
			return UserType.NON_FACULTY;
		} else {
			return UserType.VISITOR;
		}
	}
	
	public void registerUser(String email, String password, String name, UserType userType, String idField, boolean isTest) throws InvalidUserCredentialException {
		for (User user: users) {
			if (user.getEmail().equals(email)) {
				throw new InvalidUserCredentialException("Please enter valid and unique email");
			}
		}
		
		User newUser = userFactory.getUser(email, password, name, userType, idField);
		users.add(newUser);
		
		try {
			if (!isTest) { 
				update(userCsvDatabasePath);
			}
			
		} catch (Exception ex) {
			if (!isTest) {
				ScreenManager.getInstance().showError("Failed to update user csv file database");
			}
		}
	}

	private void update(String path) throws Exception {
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			csvOutput.write("name");
			csvOutput.write("id");
			csvOutput.write("email");
			csvOutput.write("password");
			csvOutput.write("type");
			csvOutput.endRecord();
			
			for (User users: users) {
				csvOutput.write(users.getName());
				csvOutput.write(String.valueOf(users.getId()));
				csvOutput.write(users.getEmail());
				csvOutput.write(users.getPassword());
				csvOutput.write(users.getTypeString());
				csvOutput.endRecord();
			}
			
			csvOutput.close();
		} catch (Exception e) {
			ScreenManager.getInstance().showError("Writing to the user csv file database failed.");
		}
	}

	public void loginUser(String email, String password) throws InvalidUserCredentialException{
		for (User existingUser: users) {
			if (existingUser.getEmail().equalsIgnoreCase(email.trim()) && existingUser.getPassword().equals(password)) {
				currentUser = existingUser;
				return;
			}
		}
		
		throw new InvalidUserCredentialException("Either email or password was invalid");
	}
	
	public User getCurrentUser() {
		return this.currentUser;
	}
	
	public void removeUser(String email, String password) { //for testing purposes
		User targetUser = null;
		
		for (User existingUser: users) {
			if (existingUser.getEmail().equalsIgnoreCase(email.trim()) && existingUser.getPassword().equals(password)) {
				targetUser = existingUser;
				break;
			}
		}
		
		if (targetUser != null) {
			this.users.remove(targetUser);
		}
	}
	
	public List<User> getUserList() { // For testing purposes
		return this.users;
	}
}
