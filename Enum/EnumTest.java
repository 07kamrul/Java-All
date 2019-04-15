package Enum;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnumTest {
	
	String monthName = Enum.contains("MAY");
	@Test
	public void test() {
		assertNotNull(monthName);
		assertEquals("MAY 31",monthName);
	}


}
