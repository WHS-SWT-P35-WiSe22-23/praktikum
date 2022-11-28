/*****************************************************************************************************
 * 	Project:			SWTKal.Base
 * <p>
 *  creation date:		01.08.2007
 * <p>
 * 
 *****************************************************************************************************
 *	date			| 	author		| 	reason for change
 * <p>
 *	01.08.2007			calproj			transfer out of the calendarium project
 *
 */
package junit.swtkal.domain;

import junit.framework.*;
import swtkal.domain.Datum;

// TODO Junit-Test für Datum und weitere Domain-Klassen ergaenzen

/*****************************************************************************************************
 * This DatumTest ......
 * 
 * @author calproj
 */
public class DatumTest extends TestCase
{
	public DatumTest(String name) { super(name); }

	public static Test suite()
	{
		TestSuite testSuite =
			new TestSuite(DatumTest.class.getName());
		
		testSuite.addTest(new DatumTest("testDatumKonstruktor"));
		testSuite.addTest(new DatumTest("testGetDay"));
		testSuite.addTest(new DatumTest("testGetMonth"));
		testSuite.addTest(new DatumTest("testGetYear"));
		testSuite.addTest(new DatumTest("testGetWeekDay"));
		testSuite.addTest(new DatumTest("testGetHoursBetween"));
		testSuite.addTest(new DatumTest("testGetDaysBetween"));
		testSuite.addTest(new DatumTest("testIsGreater"));
		
		return testSuite;
	}
	
	protected Datum datum;
	protected void setUp() throws Exception
	{
		datum = new Datum("12.06.2007");
	}
	
	public void testDatumKonstruktor() throws Exception
	{
		assertNotNull(datum);
	}
	
	public void testGetDay() throws Exception
	{
		assertEquals(12, datum.getDay());
	}

	public void testGetMonth() throws Exception
	{
		assertEquals(6, datum.getMonth());
	}

	public void testGetYear() throws Exception
	{
		assertEquals(2007, datum.getYear());
	}
	
	public void testGetWeekDay() throws Exception
	{
		assertEquals(1, datum.getWeekDay());
		assertEquals(1, Datum.getWeekDay(2007, 6, 12));
	}
	
	public void testGetHoursBetween() throws Exception
	{
		Datum stdSpaeter = new Datum("12.06.2007","01:00");
		assertEquals(1.0, datum.getHoursBetween(stdSpaeter));
	}	

	public void testGetDaysBetween() throws Exception
	{
		Datum stdSpaeter = new Datum("12.06.2007","01:00");
		assertEquals(0, datum.getDaysBetween(stdSpaeter));
		Datum tagSpaeter = new Datum("13.06.2007","05:55");
		assertEquals(1, datum.getDaysBetween(tagSpaeter));
	}
	
	public void testIsGreater() throws Exception
	{
		Datum stdSpaeter = new Datum("12.06.2007","01:00");
		assertTrue(datum.isGreater(stdSpaeter)<0);
		assertTrue(stdSpaeter.isGreater(datum)>0);
	}	
}
