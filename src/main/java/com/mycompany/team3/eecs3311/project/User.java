package com.mycompany.team3.eecs3311.project;

import java.util.Calendar;
import java.util.List;

public class User {
	private String email;
	private String password;
	private String name;
	private UserType userType;
	protected int id;
	private FixedSizeItemList borrowedItems;
	
	
	public User(String email, String password, String name, UserType userType, int id) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.userType = userType;
		this.id = id;
		if (userType == UserType.VISITOR) {
			this.id = -1; // Not applicable unless the user is a student, faculty or non-faculty
		}
		
		borrowedItems = new FixedSizeItemList(10);
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}

	public String getName() {
		return this.name;
	}

	public String getTypeString() {
		if (userType == UserType.FACULTY_MEMBER) {
			return "faculty";
		} else if (userType == UserType.STUDENT) {
			return "student";
		} else if (userType == UserType.NON_FACULTY) {
			return "non_faculty";
		} else {
			return "visitor";
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public void addItem(PhysicalItem item, Calendar date) throws LostBorrowingPrivilegeException{
		try {
			item.setDateBorrowed(date);
			borrowedItems.add(item);
		} catch (ExceedMaxListCapacityException e) {
			throw new LostBorrowingPrivilegeException("You have reached your max capacity of 10 borrowed items");
		}
	}
	
	public void removeItem(PhysicalItem item) { // for testing purposes
		borrowedItems.remove(item);
	}
	
	public List<PhysicalItem> getRentedItems() {
		return this.borrowedItems.getItemList();
	}
}
