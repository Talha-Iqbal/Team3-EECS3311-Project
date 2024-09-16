

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mycompany.team3.eecs3311.project.ItemType;

public class ItemTypeTest {

	@Test
	public void parseItemType_ItemTypeIsCorrectlyParsedFromString_MagazineCdBook() {
		assertEquals(ItemType.MAGAZINE, ItemType.parseItemType("magazine"));
		assertEquals(ItemType.CD, ItemType.parseItemType("cd"));
		assertEquals(ItemType.BOOK, ItemType.parseItemType("book"));
	}
	
	@Test
	public void parseString_StringIsCorrectlyParsedFromItemType_MagazineCdBook() {
		assertEquals("magazine", ItemType.parseString(ItemType.MAGAZINE));
		assertEquals("cd", ItemType.parseString(ItemType.CD));
		assertEquals("book", ItemType.parseString(ItemType.BOOK));
	}
	
}
