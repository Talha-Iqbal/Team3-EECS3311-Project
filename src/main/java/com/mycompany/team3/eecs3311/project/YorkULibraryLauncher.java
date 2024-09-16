package com.mycompany.team3.eecs3311.project;

import javax.swing.SwingUtilities;

public class YorkULibraryLauncher {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				SystemUtilities.getInstance().showUserLogin();
			}
		});

	}

}
