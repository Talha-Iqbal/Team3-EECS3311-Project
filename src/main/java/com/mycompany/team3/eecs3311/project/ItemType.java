package com.mycompany.team3.eecs3311.project;

public enum ItemType {
	BOOK,
	MAGAZINE,
	CD;

	public static ItemType parseItemType(String itemType) {
		if (itemType.equalsIgnoreCase("magazine")) {
			return ItemType.MAGAZINE;
		} else if (itemType.equalsIgnoreCase("cd")) {
			return ItemType.CD;
		} else {
			return ItemType.BOOK;
		}
	}
	
	public static String parseString(ItemType type) {
		if (type == ItemType.MAGAZINE) {
			return "magazine";
		} else if (type == ItemType.CD) {
			return "cd";
		} else {
			return "book";
		}
	}
}
