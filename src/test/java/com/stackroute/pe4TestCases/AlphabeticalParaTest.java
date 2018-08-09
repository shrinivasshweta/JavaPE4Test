package com.stackroute.pe4TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AlphabeticalParaTest {
	private static AlphabeticalPara ap;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		ap= new AlphabeticalPara();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		ap = null;
	}

	@Test
	public void testAlpha()
	{	String a= "the quick brown fox jumps over the lazy dog";
		String b =ap.sortPara(a);
		String c= "brown dog fox jumps lazy over quick the the";
		assertEquals(c,b );
	}
	@Test
	public void testNotAlpha()
	{	String a= "the quick brown fox jumps over the lazy dog";
		String b =ap.sortPara(a);
		String c= "brown dog fox jumps lazy over quick the";
		assertNotEquals(c,b );
	}
	
	
}
