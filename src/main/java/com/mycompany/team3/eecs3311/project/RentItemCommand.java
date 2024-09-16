package com.mycompany.team3.eecs3311.project;

public class RentItemCommand implements Command {
	private String itemTitle;
	private PhysicalItemWindow itemWindow;
	private boolean isTest;
	
	public RentItemCommand(String itemTitle, PhysicalItemWindow itemWindow, boolean isTest) {
		this.itemTitle = itemTitle;
		this.itemWindow = itemWindow;
		this.isTest = isTest;
	}
	
	@Override
	public void execute() {
		SystemUtilities.getInstance().rent(itemTitle, itemWindow, isTest);
	}

}
