package com.softserve.edu.homework04.NumbersChecker;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserve.edu.homework04.NumbersChecker.FloatChecker;

public class FloatCheckerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		FloatChecker floatCheck1 = new FloatChecker(5.000001f);
		FloatChecker floatCheck2 = new FloatChecker(-5.000001f);
		FloatChecker floatCheck3 = new FloatChecker(1.004051f);

		boolean actual1;
		boolean actual2;
		boolean actual3;
		
		boolean expected1 = false;
		actual1 = floatCheck1.inRange();
		Assert.assertEquals(expected1, actual1);
		
		
		boolean expected2 = false;
		actual2 = floatCheck2.inRange();
		Assert.assertEquals(expected2, actual2);
		
		boolean expected3 = true;
		actual3 = floatCheck3.inRange();
		Assert.assertEquals(expected3, actual3);

	}

	
	@Test
	public void test1() {
		FloatChecker floatCheck1 = new FloatChecker(2.000001f);
		FloatChecker floatCheck2 = new FloatChecker(-2.000001f);
		FloatChecker floatCheck3 = new FloatChecker(10.04051f);

		boolean actual1;
		boolean actual2;
		boolean actual3;
		
		boolean expected1 = true;
		actual1 = floatCheck1.inRange();
		Assert.assertEquals(expected1, actual1);
		
		
		boolean expected2 = true;
		actual2 = floatCheck2.inRange();
		Assert.assertEquals(expected2, actual2);
		
		boolean expected3 = false;
		actual3 = floatCheck3.inRange();
		Assert.assertEquals(expected3, actual3);

	}
	
	@Test
	public void test2() {
		FloatChecker floatCheck1 = new FloatChecker(15.000001f);
		FloatChecker floatCheck2 = new FloatChecker(-4.99999999f);
		FloatChecker floatCheck3 = new FloatChecker(0f);

		boolean actual1;
		boolean actual2;
		boolean actual3;
		
		boolean expected1 = false;
		actual1 = floatCheck1.inRange();
		Assert.assertEquals(expected1, actual1);
		
		
		boolean expected2 = true;
		actual2 = floatCheck2.inRange();
		Assert.assertEquals(expected2, actual2);
		
		boolean expected3 = true;
		actual3 = floatCheck3.inRange();
		Assert.assertEquals(expected3, actual3);

	}
	
}
