package com.mycompany.team3.eecs3311.project;

public class OneDayForwardCommand implements Command {

	@Override
	public void execute() {
		SystemUtilities.getInstance().updateDay();
	}

}
