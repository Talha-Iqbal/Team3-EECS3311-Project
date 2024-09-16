package com.mycompany.team3.eecs3311.project;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ScreenManager {
	private Map<ScreenType, Screen> screens;
	private List<Screen> openedItemScreens;
	
	private static ScreenManager screenManager = null;
	
	public static ScreenManager getInstance() {
		if (screenManager == null) {
			screenManager = new ScreenManager();
		}
			
		return screenManager;
	}
	
	private ScreenManager() {
		this.screens = new HashMap<>();
		this.openedItemScreens = new ArrayList();
	}
	
	public void showScreen(ScreenType screenToSwitchFrom, ScreenType screenToSwitchTo) {
		switch(screenToSwitchFrom) {
			case LOGIN:
				unshowLogin();
				break;
			case REGISTER:
				unshowRegistrationForm();
				break;
			case DASHBOARD:
				unshowDashboard();
				break;
		}
		
		switch(screenToSwitchTo) {
			case LOGIN:
				showLogin();
				break;
			case REGISTER:
				showRegistrationForm();
				break;
			case DASHBOARD:
				showDashboard();
				break;
		}
	}

	public void showLogin() {
		ensureScreenExists(ScreenType.LOGIN);
		screens.get(ScreenType.LOGIN).show();
	}
	
	public void unshowLogin() {
		ensureScreenExists(ScreenType.LOGIN);
		screens.get(ScreenType.LOGIN).unshow();
	}
	
	public void resetLoginForm() {
		ensureScreenExists(ScreenType.LOGIN);
		screens.get(ScreenType.LOGIN).clearFields();;		
	}
	
	public void showRegistrationForm() {
		ensureScreenExists(ScreenType.REGISTER);
		screens.get(ScreenType.REGISTER).show();
	}
	
	public void unshowRegistrationForm() {
		ensureScreenExists(ScreenType.REGISTER);
		screens.get(ScreenType.REGISTER).unshow();
	}
	
	public void resetRegistrationForm() {
		ensureScreenExists(ScreenType.REGISTER);
		screens.get(ScreenType.REGISTER).clearFields();;
	}
	
	public void showDashboard() {
		ensureScreenExists(ScreenType.DASHBOARD);
		screens.get(ScreenType.DASHBOARD).show();
		
	}

	public void unshowDashboard() {
		ensureScreenExists(ScreenType.DASHBOARD);
		screens.get(ScreenType.DASHBOARD).unshow();
	}
	
	private void ensureScreenExists(ScreenType type) {
		if (ScreenType.LOGIN == type) {
			if (screens.get(ScreenType.LOGIN) == null) {
				screens.put(ScreenType.LOGIN, new LoginWindow());
			}
		} else if (ScreenType.REGISTER == type) {
			if (screens.get(ScreenType.REGISTER) == null) {
				screens.put(ScreenType.REGISTER, new RegisterWindow());
			}
		} else if (ScreenType.DASHBOARD == type) {
			if (screens.get(ScreenType.DASHBOARD) == null) {
				screens.put(ScreenType.DASHBOARD, new DashboardWindow());
			}
		}
		
	}
	
	public void showError(String errorMessage) {
		JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void showItemScreen(PhysicalItem item) {
		new PhysicalItemWindow(item).show();
	}

	public void refreshWindow(ScreenType screenType) {
		if(screenType == ScreenType.DASHBOARD) {
			refreshDashboardWindow();
		}
	}
	
	public void refreshItemWindow(PhysicalItemWindow itemWindow) {
		itemWindow.refreshStock();
	}
	
	public void refreshDashboardWindow() {
		ensureScreenExists(ScreenType.DASHBOARD);
		DashboardWindow dashboard = (DashboardWindow) screens.get(ScreenType.DASHBOARD);
		dashboard.refresh();
	}
	
}
