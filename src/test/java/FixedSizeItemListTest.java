

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException;
import com.mycompany.team3.eecs3311.project.FixedSizeItemList;
import com.mycompany.team3.eecs3311.project.ItemType;
import com.mycompany.team3.eecs3311.project.PhysicalItem;

public class FixedSizeItemListTest {
	private FixedSizeItemList fixedList;
	private PhysicalItem item;
	private final int limit = 10;
	
	@Before
	public void setup() {
		fixedList = new FixedSizeItemList(limit);
		item = new PhysicalItem("fooTitle", "fooAuthor", 50, "fooLocation", true, false, ItemType.CD);
	}

	@Test
	public void add_ItemCanBeAddedToList_ItemIn0thIndex() {
		try {
			fixedList.add(item);
			assertEquals(item, fixedList.getItemList().get(0));
		} catch (ExceedMaxListCapacityException ex) {
			fail("ExceedMaxListCapacityException was thrown, should be able to add to list under capacity without exception being thrown");
		}
	}
	
	@Test(expected = ExceedMaxListCapacityException.class)
	public void add_ItemCannotBeAddedToFullList_ExceedMaxListCapacityExceptionThrown() throws ExceedMaxListCapacityException {
		for(int i = 0; i < limit; i++) {
			PhysicalItem fillerItem = new PhysicalItem("barTitle", "barAuthor", i, "barLocation", true, false, ItemType.MAGAZINE);
			fixedList.add(fillerItem);
		}
		
		fixedList.add(item);
	}
	
	@Test
	public void remove_RemovingExistingItemInList_ListIsEmpty() {
		try {
			assertEquals(0, fixedList.getItemList().size());
			fixedList.add(item);
			assertEquals(1, fixedList.getItemList().size());
			assertEquals(item, fixedList.getItemList().get(0));
			
			fixedList.remove(item);
			assertEquals(0, fixedList.getItemList().size());
			
		} catch (ExceedMaxListCapacityException ex) {
			fail("ExceedMaxListCapacityException was thrown, should be able to add to list under capacity without exception being thrown");
		}
	}
	
	@Test
	public void remove_RemovingNonExistentItemInList_ListIsUnchanged() {
		assertEquals(0, fixedList.getItemList().size());
		fixedList.remove(item);
		assertEquals(0, fixedList.getItemList().size());
	}
	
	@Test
	public void getItemList_WrappedListContainsElementsAdded_ListIsNonEmpty() {
		try {
			List<PhysicalItem> itemList = fixedList.getItemList();
			assertEquals(0, itemList.size());
			
			fixedList.add(item);
			itemList = fixedList.getItemList();
			
			assertEquals(1, itemList.size());
			assertEquals(item, itemList.get(0));

		} catch (ExceedMaxListCapacityException ex) {
			fail("ExceedMaxListCapacityException was thrown, should be able to add to list under capacity without exception being thrown");
		}
	}
}
