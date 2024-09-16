

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.DateManager;

public class DateManagerTest {
	private DateManager dateManager;
	private Calendar.Builder dateBuilder;
	
	@Before
	public void setup() {
		dateBuilder = new Calendar.Builder();
		dateManager = DateManager.getInstance();
	}
	
	@Test
	public void updateDay_DateIsIncrementedByOneDay_DateIsNowMarch2nd() {
		dateManager.setDate(2024, Calendar.MARCH, 1);
		dateManager.updateDay();
		Calendar currentDate = dateManager.getDate();
		
		assertEquals(2024, currentDate.get(Calendar.YEAR));
		assertEquals(Calendar.MARCH, currentDate.get(Calendar.MONTH));
		assertEquals(2, currentDate.get(Calendar.DAY_OF_MONTH));
	}
	
	@Test
	public void updateDay_DateCorrectlyRollsOverToNextMonth_DateIsNowApril1st() {
		dateManager.setDate(2024, Calendar.MARCH, 31);
		dateManager.updateDay();
		Calendar currentDate = dateManager.getDate();
		
		assertEquals(2024, currentDate.get(Calendar.YEAR));
		assertEquals(Calendar.APRIL, currentDate.get(Calendar.MONTH));
		assertEquals(1, currentDate.get(Calendar.DAY_OF_MONTH));
	}
	
	@Test
	public void getDate_CalendarObjectisReturned_CalendarObject() {
		dateManager.setDate(2024, Calendar.MARCH, 1);
		Calendar currentDate = dateManager.getDate();
		
		assertTrue(currentDate instanceof Calendar);
	}
	
	@Test
	public void getDate_CalendarObjectWithCorrectState_CalendarObjectForMarch1st() {
		dateManager.setDate(2024, Calendar.MARCH, 1);
		Calendar currentDate = dateManager.getDate();
		
		assertEquals(2024, currentDate.get(Calendar.YEAR));
		assertEquals(Calendar.MARCH, currentDate.get(Calendar.MONTH));
		assertEquals(1, currentDate.get(Calendar.DAY_OF_MONTH));
	}
	
	@Test
	public void getCurrentDateString_DateIsHumanReadableFormat_March1st2024() {
		dateManager.setDate(2024, Calendar.MARCH, 1);
		
		assertEquals("3/1/2024", dateManager.getCurrentDateString());
	}
	
	@Test
	public void getPreviewDueDateString_DueDateIsOneMonthAwayInHumanReadableFormat_April1st2024() {
		dateManager.setDate(2024, Calendar.MARCH, 1);
		
		assertEquals("3/31/2024", dateManager.getPreviewDueDateString());
	}
	
	@Test
	public void getPreviewDueDateString_DueDateCorrectRollsOverToNextMonth_March1st2024() {
		dateManager.setDate(2024, Calendar.JANUARY, 31);
		
		assertEquals("3/1/2024", dateManager.getPreviewDueDateString());
	}
	
	@Test
	public void formatGivenDateToString_DateGivenIsConvertedIntoHumanReadableString_March25th2024() {
		Calendar givenDate = dateBuilder.setDate(2024, Calendar.MARCH, 25).build();
		dateManager = DateManager.getInstance();
		
		assertEquals("3/25/2024", dateManager.formatGivenDateToString(givenDate));
	}
	
	@Test
	public void formatDueDateStringFromGivenDate_HumanReadableDueDateStringGeneratedFromGivenDate_April2nd2024() {
		Calendar givenDate = dateBuilder.setDate(2024, Calendar.MARCH, 2).build();
		dateManager = DateManager.getInstance();
		
		assertEquals("4/1/2024", dateManager.formatDueDateStringFromGivenDate(givenDate));
	}
}
