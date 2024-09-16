package com.mycompany.team3.eecs3311.project;

import javax.swing.JTextField;

public class SearchItemCommand implements Command {
	private JTextField searchField;
	
	public SearchItemCommand(JTextField searchField) {
		this.searchField = searchField;
	}
	
	@Override
	public void execute() {
		SystemUtilities.getInstance().search(searchField.getText());
	}

}
