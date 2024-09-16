

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.team3.eecs3311.project.DateManager;
import com.mycompany.team3.eecs3311.project.OneDayForwardCommand;
import com.mycompany.team3.eecs3311.project.SystemUtilities;

public class OneDayForwardCommandTest {

	private OneDayForwardCommand oneDayForwardCommand;
	private SystemUtilities systemUtilities;
	private DateManager dateManager;
	
	@Before
	public void setup() {
		oneDayForwardCommand = new OneDayForwardCommand(); 
		dateManager = DateManager.getInstance();
		systemUtilities = SystemUtilities.getInstance();
		
		systemUtilities.loginUser("foo@yorku.ca","Foo123!");
	}
	
	@Test
	public void execute_DateIncreasesByOne_March2nd2024( ) {
		dateManager.setDate(2024, Calendar.MARCH, 1);
		
		assertEquals(1,systemUtilities.getDay().get(Calendar.DAY_OF_MONTH));
		assertEquals(2,systemUtilities.getDay().get(Calendar.MONTH));
		assertEquals(2024,systemUtilities.getDay().get(Calendar.YEAR));
		
		oneDayForwardCommand.execute();
		
		assertEquals(2,systemUtilities.getDay().get(Calendar.DAY_OF_MONTH));
		assertEquals(2,systemUtilities.getDay().get(Calendar.MONTH));
		assertEquals(2024,systemUtilities.getDay().get(Calendar.YEAR));
	}
	

	@Test
	public void execute_DateRollsOverBetweenMonths_April1st2024( ) {
		dateManager.setDate(2024, Calendar.MARCH, 31);
		
		assertEquals(31,systemUtilities.getDay().get(Calendar.DAY_OF_MONTH));
		assertEquals(2,systemUtilities.getDay().get(Calendar.MONTH));
		assertEquals(2024,systemUtilities.getDay().get(Calendar.YEAR));
		
		oneDayForwardCommand.execute();

		assertEquals(1,systemUtilities.getDay().get(Calendar.DAY_OF_MONTH));
		assertEquals(3,systemUtilities.getDay().get(Calendar.MONTH));
		assertEquals(2024,systemUtilities.getDay().get(Calendar.YEAR));
	}

}
