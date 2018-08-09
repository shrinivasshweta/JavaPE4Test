package com.stackroute.pe4TestCases;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransposeTest {

	private static Transpose t;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		t= new Transpose();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		t = null;
	}
	
	@Test
	public void testTranspose()
	{ String s="a quick brown fox jumps over the lazy dog";
	  String y="a kciuq nworb xof spmuj revo eht yzal god";
	assertEquals(y, t.doTranspose(s));
	}
	@Test
	public void testNotTranspose()
	{ String s="a quick brown fox jumps over the lazy dog";
	  String y="a kciuq nworb xof spmuj revo eht yzal dog";
	assertNotEquals(y, t.doTranspose(s));
	}

}
