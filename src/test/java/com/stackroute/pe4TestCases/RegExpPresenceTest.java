package com.stackroute.pe4TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegExpPresenceTest {
	private static RegExpPresence rp;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		rp= new RegExpPresence();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		rp = null;
	}
	
	@Test
	public void testPresence()
	{ String s = "My name is Harry";
		assertEquals(true, rp.testHarry(s));
	}
	
	@Test
	public void testPresence1()
	{ String s = "My name is Rutuja";
		assertEquals(false, rp.testHarry(s));
	}
	
	@Test
	public void testNotPresence()
	{ String s = "My name is Harry";
		assertNotEquals(false, rp.testHarry(s));
	}
}
