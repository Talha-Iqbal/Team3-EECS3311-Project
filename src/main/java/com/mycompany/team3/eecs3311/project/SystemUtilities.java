package com.mycompany.team3.eecs3311.project;

import java.util.Calendar;

public class SystemUtilities {
	private ScreenManager screenManager;
	private UserManager userManager;
	private PhysicalItemManager physicalItemManager;
	private DateManager dateManager;
	
	private static SystemUtilities systemUtility = null;
	
	public static SystemUtilities getInstance() {
		if (systemUtility == null) {
			systemUtility = new SystemUtilities();
		}
		
		return systemUtility;
	}
	
	private SystemUtilities() {
		this.screenManager = ScreenManager.getInstance();
		this.userManager = UserManager.getInstance();
		this.physicalItemManager = PhysicalItemManager.getInstance();
		this.dateManager = DateManager.getInstance();
	}
	
	public void switchScreens(ScreenType screenToSwitchFrom, ScreenType screenToSwitchTo) {
		screenManager.showScreen(screenToSwitchFrom, screenToSwitchTo);
	}

	public void showUserLogin() {
		screenManager.showLogin();
	}
	
	public void loginUser(String email, String password) {
		try {
			userManager.loginUser(email, password);
			screenManager.resetLoginForm();
			screenManager.showScreen(ScreenType.LOGIN, ScreenType.DASHBOARD);
		} catch (InvalidUserCredentialException ex) {
			screenManager.showError(ex.getMessage());
			screenManager.resetRegistrationForm();
		}
	}
	
	public User getCurrentUser() {
		return userManager.getCurrentUser();
	}
	
	public void showUserRegistration() {
		screenManager.showRegistrationForm();
	}

	public void registerUser(String email, String password, String name, UserType userType, String idField, boolean isTest)  {
		try {
			userManager.registerUser(email, password, name, userType, idField, isTest);
			screenManager.resetRegistrationForm();
			switchScreens(ScreenType.REGISTER, ScreenType.LOGIN);
		} catch (InvalidUserCredentialException ex) {
			screenManager.showError(ex.getMessage());
			screenManager.resetRegistrationForm();
		}
			
	}
	
	public void search(String itemTitle) {
		try {
			PhysicalItem item = physicalItemManager.searchForItem(itemTitle);
			screenManager.showItemScreen(item);
		} catch (ItemDoesNotExistException ex) {
			screenManager.showError(ex.getMessage());
		}
	}
	
	public void rent(String itemTitle, PhysicalItemWindow itemWindow, boolean isTest) {
		try {
			physicalItemManager.rentItem(itemTitle, itemWindow, isTest);
		} catch (ItemNotInStockException ex) {
			screenManager.showError(ex.getMessage());
		}
	}
	
	public int getItemStock(String itemTitle) { 
		try {
			return physicalItemManager.getItemStock(itemTitle);
		} catch (ItemDoesNotExistException ex) {
			screenManager.showError(ex.getMessage());
		}
		
		return -1; // Something went wrong, this should not be reachable
	}
	
	public void refreshScreen(ScreenType screenType) {
		screenManager.refreshWindow(screenType);
	}

	public Calendar getDay() {
		return dateManager.getDate();
	}
	
	public void updateDay() {
		dateManager.updateDay();
		screenManager.refreshDashboardWindow();
	}
	
	public String getCurrentDateString() {
		return dateManager.getCurrentDateString();
	}
	
	public String getPreviewDueDateString() {
		return dateManager.getPreviewDueDateString();
	}
	
	public String formatCurrentDateString(Calendar date) {
		return dateManager.formatGivenDateToString(date);
	}
	
	public String formatDueDateString(Calendar date) {
		return dateManager.formatDueDateStringFromGivenDate(date);
	}
}
