package com.mycompany.team3.eecs3311.project;

import java.awt.Dimension;

import javax.swing.JFrame;

public abstract class BaseWindow {
	protected JFrame window;
	
	public BaseWindow(String windowTitle) {
		this(windowTitle, 1200, 720);
	}
	
	public BaseWindow(String windowTitle, int width, int height) {
		window = new JFrame();
		window.setTitle(windowTitle);
		window.setMinimumSize(new Dimension(width, height));
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
