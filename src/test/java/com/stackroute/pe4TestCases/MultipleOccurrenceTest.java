package com.stackroute.pe4TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultipleOccurrenceTest {
	private static MultipleOccurrence mo;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		mo= new MultipleOccurrence();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		mo = null;
	}
	
	@Test
	public void testOccur() {
		String s="She sells seashells by the seashore";
		String a= mo.testOccurrence(s);
		assertEquals("Found at:4-6 Found at:10-12 Found at:27-29", a);
	}
	
	@Test
	public void testNotOccur() {
		String s="She sells seashells by the seashore";
		String a= mo.testOccurrence(s);
		assertNotEquals("Found at:4-6 Found at:10-12 Found at:27-30", a);
	}
}
