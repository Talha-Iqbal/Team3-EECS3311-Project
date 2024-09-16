package com.mycompany.team3.eecs3311.project;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DashboardWindow extends BaseWindow implements Screen {
	private GridBagLayout mainLayout;
	private GridBagConstraints mainLayoutConstraints;
	
	private JPanel topPanel;
	private JPanel searchPanel;
	private JPanel rentedItemPanel;
	private JPanel demonstrationPanel;
	private JPanel userOptionsPanel;
	
	private JLabel welcomeUserPrompt;
	private JLabel searchPrompt;
	private JLabel currentDatePrompt;
	private JLabel booksRentedPrompt;
	private JLabel demonstrationPrompt;

	private JTextField searchBar;
	
	private Button searchButton;
	private Button logoutButton;
	private Button refreshButton;
	private Button oneDayForwardButton;
	
	public DashboardWindow() {
		super("YorkU Library Management App - Dashboard");
		mainLayout = new GridBagLayout();
		mainLayoutConstraints = new GridBagConstraints();
		
		topPanel = new JPanel(mainLayout);
		searchPanel = new JPanel();
		demonstrationPanel = new JPanel();
		rentedItemPanel = new JPanel(mainLayout);
		userOptionsPanel = new JPanel();
		
		welcomeUserPrompt = new JLabel("Welcome " + SystemUtilities.getInstance().getCurrentUser().getName() + "!");
		welcomeUserPrompt.setFont(new Font(null, Font.BOLD, 16));
		addComponentToGridBagContainer(
				topPanel,
				welcomeUserPrompt,
				mainLayout,
				mainLayoutConstraints,
				0,
				0);
		
		currentDatePrompt = new JLabel("Current Date: " + SystemUtilities.getInstance().getCurrentDateString());
		currentDatePrompt.setFont(new Font(null, Font.PLAIN, 14));
		addComponentToGridBagContainer(
				topPanel,
				currentDatePrompt,
				mainLayout,
				mainLayoutConstraints,
				0,
				1);
		
		searchPrompt = new JLabel("What are you looking for?");
		searchPrompt.setFont(new Font(null, Font.BOLD, 14));
		searchBar = new JTextField(50);
		searchButton = new Button("Search");
		searchButton.setCommand(new SearchItemCommand(searchBar));
		searchButton.setActionEventListener();
		searchPanel.add(searchPrompt);
		searchPanel.add(searchBar);
		searchPanel.add(searchButton);
		addComponentToGridBagContainer(
				topPanel,
				searchPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				2);
		
		demonstrationPrompt = new JLabel("For demonstration purposes");
		demonstrationPrompt.setFont(new Font(null, Font.ITALIC, 14));
		demonstrationPanel.add(demonstrationPrompt);
		
		oneDayForwardButton = new Button("Move forward one day.");
		oneDayForwardButton.setCommand(new OneDayForwardCommand());
		oneDayForwardButton.setActionEventListener();
		demonstrationPanel.add(oneDayForwardButton);
		
		booksRentedPrompt = new JLabel("Items Rented");
		booksRentedPrompt.setFont(new Font(null, Font.BOLD, 14));
		addComponentToGridBagContainer(
				rentedItemPanel,
				booksRentedPrompt,
				mainLayout,
				mainLayoutConstraints,
				0,
				0);
		addRentedItemsToPanel();
		
		refreshButton = new Button("Refresh");
		refreshButton.setCommand(new ScreenRefreshCommand(ScreenType.DASHBOARD));
		refreshButton.setActionEventListener();
		logoutButton = new Button("Logout");
		logoutButton.setCommand(new ScreenSwitchCommand(ScreenType.DASHBOARD, ScreenType.LOGIN));
		logoutButton.setActionEventListener();
		userOptionsPanel.add(refreshButton);
		userOptionsPanel.add(logoutButton);
		
		window.add(topPanel, BorderLayout.NORTH);
		window.add(demonstrationPanel, BorderLayout.EAST);
		window.add(rentedItemPanel, BorderLayout.CENTER);
		window.add(userOptionsPanel, BorderLayout.SOUTH);
	}
	
	private void addRentedItemsToPanel() {
		User currentUser = SystemUtilities.getInstance().getCurrentUser();
		List<PhysicalItem> currentRentedItems = currentUser.getRentedItems();
		
		for (int i = 0; i < currentRentedItems.size(); i++) {
			PhysicalItem itemInstance = currentRentedItems.get(i);
			JLabel itemLabel = new JLabel(itemInstance.getTitle() + ", due on " + (itemInstance.getDueDateString()));
			itemLabel.setFont(new Font(null, Font.PLAIN, 13));
			
			addComponentToGridBagContainer(
					rentedItemPanel,
					itemLabel,
					mainLayout,
					mainLayoutConstraints,
					0,
					i + 1);
		}
		
	}
	
	private void addComponentToGridBagContainer(
			JComponent container,
			JComponent component,
			GridBagLayout layout,
			GridBagConstraints constraints,
			int gridx,
			int gridy) {
		constraints.gridx = gridx;
		constraints.gridy = gridy;
		constraints.gridwidth = 3;
		constraints.gridheight = 1;
		layout.setConstraints(component, constraints);
		container.add(component);
	}
	
	public void refresh() {
		topPanel.removeAll();
		addComponentToGridBagContainer(
				topPanel,
				welcomeUserPrompt,
				mainLayout,
				mainLayoutConstraints,
				0,
				0);
		
		currentDatePrompt = new JLabel("Current Date: " + SystemUtilities.getInstance().getCurrentDateString());
		currentDatePrompt.setFont(new Font(null, Font.PLAIN, 14));
		addComponentToGridBagContainer(
				topPanel,
				currentDatePrompt,
				mainLayout,
				mainLayoutConstraints,
				0,
				1);
		
		addComponentToGridBagContainer(
				topPanel,
				searchPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				2);
		
		rentedItemPanel.removeAll();
		addComponentToGridBagContainer(
				rentedItemPanel,
				booksRentedPrompt,
				mainLayout,
				mainLayoutConstraints,
				0,
				0);
		addRentedItemsToPanel();
		show();
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
		searchBar.setText("");
	}

}
