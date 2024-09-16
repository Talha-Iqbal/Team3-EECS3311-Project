package com.mycompany.team3.eecs3311.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton{
	private Command command;
	
	public Button(String text) {
		super(text);
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		this.command.execute();
	}
	
	public void setActionEventListener() {
		this.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				command.execute();
			}

		});
	}
	
}
