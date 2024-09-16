

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import com.mycompany.team3.eecs3311.project.ItemType;
import com.mycompany.team3.eecs3311.project.PhysicalItem;

public class PhysicalItemTest {
	private Calendar.Builder dateBuilder = new Calendar.Builder();
	private PhysicalItem physicalItem;

	
	@Before
	public void setup() {
		physicalItem = new PhysicalItem("fooTitle", "fooAuthor", 10, "fooLocation", true, true, ItemType.BOOK);
		
	}
	
	@Test
	public void getTitle_TitleIsCorrectlyReturned_fooTitle() 	{
		assertEquals("fooTitle", physicalItem.getTitle());
	}
	
	@Test
	public void getAuthor_AuthorIsCorrectlyReturned_fooAuthor() {	
		assertEquals("fooAuthor",physicalItem.getAuthor());
	}
	
	@Test
	public void getIdString_IdStringIsCorrectlyReturned_10() {
		assertEquals("10", physicalItem.getIdString());
	}
	
	@Test
	public void getLocation_LocationIsCorrectlyReturned_fooLocation() {
		assertEquals("fooLocation", physicalItem.getLocation());
	}
	
	@Test
	public void getEnableStatus_EnableStatusIsCorrectlyReturned_true() {
		assertTrue(physicalItem.getEnableStatus());
	}
	
	@Test
	public void getPurchaseableStatus_PurchaseableStatusIsCorrectlyReturned_true() {
		assertTrue(physicalItem.getPurchasableStatus());
	}
	
	@Test
	public void getEnableStatusCsv_EnableStatusCsvIsCorrectlyReturned_TRUE() {
		assertEquals("TRUE", physicalItem.getEnableStatusCsv());
	}
	
	@Test
	public void getEnableStatusCsv_EnableStatusCsvIsCorrectlyReturned_FALSE() {
		physicalItem = new PhysicalItem("fooTitle", "fooAuthor", 10, "fooLocation", false, false, ItemType.BOOK);
		assertEquals("FALSE", physicalItem.getEnableStatusCsv());
	}
	
	@Test
	public void getEnableStatusDisplay_EnableStatusDisplayIsCorrectlyReturned_yes() {
		assertEquals("yes", physicalItem.getEnableStatusDisplay());
	}
	
	@Test
	public void getEnableStatusDisplay_EnableStatusDisplayIsCorrectlyReturned_no() {
		physicalItem = new PhysicalItem("fooTitle", "fooAuthor", 10, "fooLocation", false, false, ItemType.BOOK);
		assertEquals("no", physicalItem.getEnableStatusDisplay());
	}
	
	@Test
	public void getPurchaseStatusCsv_PurchaseStatusCsvIsCorrectlyReturned_TRUE() {
		assertEquals("TRUE", physicalItem.getPurchaseStatusCsv());
	}
	
	@Test
	public void getPurchaseStatusCsv_PurchaseStatusCsvIsCorrectlyReturned_FALSE() {
		physicalItem = new PhysicalItem("fooTitle", "fooAuthor", 10, "fooLocation", false, false, ItemType.BOOK);
		assertEquals("FALSE", physicalItem.getPurchaseStatusCsv());
	}
	
	@Test
	public void getPurchaseStatusDisplay_PurchaseStatusDisplayIsCorrectlyReturned_yes() {
		assertEquals("yes", physicalItem.getPurchaseStatusDisplay());
	}
	
	@Test
	public void getPurchaseStatusDisplay_PurchaseStatusDisplayIsCorrectlyReturned_no() {
		physicalItem = new PhysicalItem("fooTitle", "fooAuthor", 10, "fooLocation", false, false, ItemType.BOOK);
		assertEquals("no", physicalItem.getPurchaseStatusDisplay());
	}
	
	
	
	@Test
	public void getItemTypeString_ItemTypeStringIsCorrectlyReturned_book() {
		assertEquals("book", physicalItem.getItemTypeString());
	}
	
	@Test
	public void clone_CheckIfNewItemIsDeepyCopy_objectsDifferent() {
		PhysicalItem physicalItemCloned = physicalItem.clone();
		
		assertNotEquals(physicalItem, physicalItemCloned);
	}
	
	@Test
	public void clone_CheckIfContentIsSame_itemsSame() {
		PhysicalItem physicalItemCloned = physicalItem.clone();
		
		assertEquals(physicalItemCloned.getTitle(), physicalItem.getTitle());
		assertEquals(physicalItemCloned.getAuthor(), physicalItem.getAuthor());
		assertEquals(physicalItemCloned.getIdString(), physicalItem.getIdString());
		assertEquals(physicalItemCloned.getLocation(), physicalItem.getLocation());
		assertEquals(physicalItemCloned.getEnableStatusCsv(), physicalItem.getEnableStatusCsv());
		assertEquals(physicalItemCloned.getPurchaseStatusCsv(), physicalItem.getPurchaseStatusCsv());
		assertEquals(physicalItemCloned.getItemTypeString(), physicalItem.getItemTypeString());
	}
	
	@Test
	public void getDateBorrowed_CheckIfInitializationWorks_uninitializedDate() {
		assertEquals(new Calendar.Builder().setDate(-1, -1, -1).build(), physicalItem.getDateBorrowed());
	}
	
	@Test
	public void setDateBorrowed_DateBorrowedIsSetProperly_March272024() {
		Calendar date = dateBuilder.setDate(2024, Calendar.MARCH, 27).build();
		physicalItem.setDateBorrowed(date);
		
		assertEquals(dateBuilder.setDate(2024, Calendar.MARCH, 27).build(), physicalItem.getDateBorrowed());
	}
	
	@Test
	public void getDateBorrowedString_CheckIfSettingADateAllowsGetterToWork_March272024() {
		Calendar date = dateBuilder.setDate(2024, Calendar.MARCH, 27).build();
		physicalItem.setDateBorrowed(date);
		
		assertEquals("3/27/2024",physicalItem.getDateBorrowedString());
	}
	
	@Test
	public void getDueDateString_CheckIfDueDateProperlyUpsTheMonthByOne_April272024() {
		Calendar borrowedDate = dateBuilder.setDate(2024, Calendar.MARCH, 27).build();
		
		physicalItem.setDateBorrowed(borrowedDate);
		
		assertEquals("4/26/2024", physicalItem.getDueDateString());
	}

}
