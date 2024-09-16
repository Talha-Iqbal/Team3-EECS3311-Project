package com.mycompany.team3.eecs3311.project;

public class ScreenRefreshCommand implements Command {
	private ScreenType screenType;
	
	public ScreenRefreshCommand(ScreenType screenType) {
		this.screenType = screenType;
	}
	
	@Override
	public void execute() {
		SystemUtilities.getInstance().refreshScreen(screenType);

	}

}
