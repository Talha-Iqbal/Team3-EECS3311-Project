package com.mycompany.team3.eecs3311.project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FixedSizeItemList {
	private List<PhysicalItem> fixedList;
	private int limit;
	
	public FixedSizeItemList(int limit) {
		this.fixedList = new ArrayList();
		this.limit = limit;
	}
	
	public void add(PhysicalItem element) throws ExceedMaxListCapacityException {
		if (fixedList.size() >= limit) {
			throw new ExceedMaxListCapacityException("You have reached max capacity of " + this.limit + " rented items.");
		}
		
		fixedList.add(element);
	}
	
	public void remove(PhysicalItem element) {
		fixedList.remove(element);
	}
	
	public List<PhysicalItem> getItemList() {
		return fixedList;
	}
}
