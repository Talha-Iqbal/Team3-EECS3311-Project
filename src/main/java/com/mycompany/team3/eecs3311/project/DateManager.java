package com.mycompany.team3.eecs3311.project;

import java.util.Calendar;

public class DateManager {
	private Calendar currentDate;
	private static DateManager dateManager = null;
	
	public static DateManager getInstance() {
		if (dateManager == null) {
			dateManager = new DateManager();
		}
		
		return dateManager;
	}
	
	private DateManager() {
		Calendar.Builder calendarBuilder = new Calendar.Builder();
		
		// Java indexes months starting from 0 to represent January
		this.currentDate = calendarBuilder.setDate(2024, Calendar.MARCH, 1).build();
	}
	
	public void updateDay() {
		currentDate.add(Calendar.DAY_OF_MONTH, 1);
	}
	
	public Calendar getDate() {
		return currentDate;
	}
	
	public String getCurrentDateString() {
		return (currentDate.get(Calendar.MONTH) + 1)  + "/" +  currentDate.get(Calendar.DAY_OF_MONTH) + "/" + currentDate.get(Calendar.YEAR);
	}
	
	public void setDate(int year, int month, int day) {
		Calendar.Builder calendarBuilder = new Calendar.Builder();
		this.currentDate = calendarBuilder.setDate(year, month, day).build();
		
	}
	
	public String getPreviewDueDateString() {
		Calendar.Builder calendarBuilder = new Calendar.Builder();
		int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
		int currentMonth = currentDate.get(Calendar.MONTH);
		int currentYear = currentDate.get(Calendar.YEAR);
		
		Calendar dueDate = calendarBuilder.setDate(currentYear, currentMonth, currentDay).build();
		dueDate.add(Calendar.DAY_OF_MONTH, 30);
		
		return (dueDate.get(Calendar.MONTH) + 1) + "/" + dueDate.get(Calendar.DAY_OF_MONTH) + "/" + dueDate.get(Calendar.YEAR);
	}
	
	public String formatGivenDateToString(Calendar date) {
		return (date.get(Calendar.MONTH) + 1) + "/" +  date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.YEAR);
	}
	
	public String formatDueDateStringFromGivenDate(Calendar date) {
		Calendar.Builder calendarBuilder = new Calendar.Builder();
		int currentDay = date.get(Calendar.DAY_OF_MONTH);
		int currentMonth = date.get(Calendar.MONTH);
		int currentYear = date.get(Calendar.YEAR);
		
		Calendar dueDate = calendarBuilder.setDate(currentYear, currentMonth, currentDay).build();
		dueDate.add(Calendar.DAY_OF_MONTH, 30);
		
		return (dueDate.get(Calendar.MONTH) + 1) + "/" + dueDate.get(Calendar.DAY_OF_MONTH) + "/" + dueDate.get(Calendar.YEAR);
	}

}
