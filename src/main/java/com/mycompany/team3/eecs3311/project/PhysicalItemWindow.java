package com.mycompany.team3.eecs3311.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PhysicalItemWindow extends BaseWindow implements Screen{
	private PhysicalItem item;
	
	private GridBagLayout mainLayout;
	private GridBagConstraints mainLayoutConstraints;
	
	private JPanel mainPanel;
	private JPanel titlePanel;
	private JPanel authorPanel;
	private JPanel idPanel;
	private JPanel locationPanel;
	private JPanel enabledPanel;
	private JPanel purchasablePanel;
	private JPanel itemTypePanel;
	private JPanel itemStockPanel;
	private JPanel buttonPanel;
	private JPanel datePanel;
	private JPanel dueDatePreviewPanel;
	
	private JLabel titlePrompt;
	private JLabel title;
	private JLabel authorPrompt;
	private JLabel author;
	private JLabel idPrompt;
	private JLabel id;
	private JLabel locationPrompt;
	private JLabel location;
	private JLabel enabledStatusPrompt;
	private JLabel enabledStatus;
	private JLabel purchaseStatusPrompt;
	private JLabel purchaseStatus;
	private JLabel itemTypePrompt;
	private JLabel itemType;
	private JLabel itemStockPrompt;
	private JLabel itemStock;
	private JLabel dateLabel;
	private JLabel dueDatePreviewLabel;
	
	private Button rentButton;
	private Button buyButton;
	
	public PhysicalItemWindow(PhysicalItem item) {
		super("YorkU Library Management App - " + item.getTitle(), 800, 600);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.item = item;
		
		initialize();
	}
	
	private void initialize() {
		mainLayout = new GridBagLayout();
		mainLayoutConstraints = new GridBagConstraints();
		
		mainPanel = new JPanel(mainLayout);
		titlePanel = new JPanel();
		authorPanel = new JPanel();
		idPanel = new JPanel();
		locationPanel = new JPanel();
		enabledPanel = new JPanel();
		purchasablePanel = new JPanel();
		itemTypePanel = new JPanel();
		itemStockPanel = new JPanel();
		buttonPanel = new JPanel();
		datePanel = new JPanel();
		dueDatePreviewPanel = new JPanel();
		
		titlePrompt = new JLabel("Title:");
		titlePrompt.setFont(new Font(null, Font.BOLD, 14));
		title = new JLabel(item.getTitle());
		title.setFont(new Font(null, Font.PLAIN, 14));
		titlePanel.add(titlePrompt);
		titlePanel.add(title);
		addComponentToGridBagContainer(
				mainPanel,
				titlePanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				0);
		
		authorPrompt = new JLabel("Author:");
		authorPrompt.setFont(new Font(null, Font.BOLD, 14));
		author = new JLabel(item.getAuthor());
		author.setFont(new Font(null, Font.PLAIN, 14));
		authorPanel.add(authorPrompt);
		authorPanel.add(author);
		addComponentToGridBagContainer(
				mainPanel,
				authorPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				1);
		
		idPrompt = new JLabel("ID:");
		idPrompt.setFont(new Font(null, Font.BOLD, 14));
		id = new JLabel(item.getIdString());
		id.setFont(new Font(null, Font.PLAIN, 14));
		idPanel.add(idPrompt);
		idPanel.add(id);
		addComponentToGridBagContainer(
				mainPanel,
				idPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				2);
		
		locationPrompt = new JLabel("Location:");
		locationPrompt.setFont(new Font(null, Font.BOLD, 14));
		location = new JLabel(item.getLocation());
		location.setFont(new Font(null, Font.PLAIN, 14));
		locationPanel.add(locationPrompt);
		locationPanel.add(location);
		addComponentToGridBagContainer(
				mainPanel,
				locationPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				3);
		
		enabledStatusPrompt = new JLabel("Can Rent:");
		enabledStatusPrompt.setFont(new Font(null, Font.BOLD, 14));
		enabledStatus = new JLabel(item.getEnableStatusDisplay());
		enabledStatus.setFont(new Font(null, Font.PLAIN, 14));
		enabledPanel.add(enabledStatusPrompt);
		enabledPanel.add(enabledStatus);
		addComponentToGridBagContainer(
				mainPanel,
				enabledPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				4);
		
		purchaseStatusPrompt = new JLabel("Can Purchase:");
		purchaseStatusPrompt.setFont(new Font(null, Font.BOLD, 14));
		purchaseStatus = new JLabel(item.getPurchaseStatusDisplay());
		purchaseStatus.setFont(new Font(null, Font.PLAIN, 14));
		purchasablePanel.add(purchaseStatusPrompt);
		purchasablePanel.add(purchaseStatus);
		addComponentToGridBagContainer(
				mainPanel,
				purchasablePanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				5);
		
		itemTypePrompt = new JLabel("Type:");
		itemTypePrompt.setFont(new Font(null, Font.BOLD, 14));
		itemType = new JLabel(item.getItemTypeString());
		itemType.setFont(new Font(null, Font.PLAIN, 14));
		itemTypePanel.add(itemTypePrompt);
		itemTypePanel.add(itemType);
		addComponentToGridBagContainer(
				mainPanel,
				itemTypePanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				6);
		
		itemStockPrompt = new JLabel("Stock:");
		itemStockPrompt.setFont(new Font(null, Font.BOLD, 14));
		itemStock = new JLabel(String.valueOf(SystemUtilities.getInstance().getItemStock(item.getTitle())));
		itemStock.setFont(new Font(null, Font.PLAIN, 14));
		itemStockPanel.add(itemStockPrompt);
		itemStockPanel.add(itemStock);
		addComponentToGridBagContainer(
				mainPanel,
				itemStockPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				7);
		
		rentButton = getRentButton();
		buyButton = getBuyButton();
		buttonPanel.add(rentButton);
		buttonPanel.add(buyButton);
		addComponentToGridBagContainer(
				mainPanel,
				buttonPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				8);
		
		dateLabel = new JLabel("Today is: " + SystemUtilities.getInstance().getCurrentDateString());
		dateLabel.setFont(new Font(null, Font.PLAIN, 14));
		datePanel.add(dateLabel);
		addComponentToGridBagContainer(
				mainPanel,
				datePanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				9);
		
		dueDatePreviewLabel = new JLabel("Will be due by: " + SystemUtilities.getInstance().getPreviewDueDateString());
		dueDatePreviewLabel.setFont(new Font(null, Font.PLAIN, 14));
		dueDatePreviewPanel.add(dueDatePreviewLabel);
		addComponentToGridBagContainer(
				mainPanel,
				dueDatePreviewPanel,
				mainLayout,
				mainLayoutConstraints,
				0,
				10);
		
		window.add(mainPanel, BorderLayout.CENTER);
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
	
	private Button getRentButton() {
		Button rent = new Button("Rent");
		rent.setCommand(new RentItemCommand(item.getTitle(), this, false));
		rent.setActionEventListener();
		
		if (!item.getEnableStatus()) {
			rent.setEnabled(false);
		}
		
		return rent;
	}
	
	private Button getBuyButton() {
		Button buy = new Button("Buy");
		
		if (!item.getPurchasableStatus()) {
			buy.setEnabled(false);
		}
		
		return buy;
	}
	
	public JFrame getWrappedFrame() {
		return this.window;
	}
	
	public void refreshStock() {
		itemStock.setText(String.valueOf(SystemUtilities.getInstance().getItemStock(item.getTitle())));
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
		// No relevant fields
	}
	
	

}
