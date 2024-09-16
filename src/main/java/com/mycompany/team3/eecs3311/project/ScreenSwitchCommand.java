package com.mycompany.team3.eecs3311.project;

public class ScreenSwitchCommand implements Command {
	private ScreenType screenToSwitchFrom;
	private ScreenType screenToSwitchTo;
	
	public ScreenSwitchCommand(ScreenType sendingScreen, ScreenType targetScreen) {
		this.screenToSwitchFrom = sendingScreen;
		this.screenToSwitchTo = targetScreen;
	}
	
	@Override
	public void execute() {
		SystemUtilities.getInstance().switchScreens(screenToSwitchFrom, screenToSwitchTo);
	}

}
