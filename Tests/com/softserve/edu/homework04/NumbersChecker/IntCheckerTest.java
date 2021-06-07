package com.softserve.edu.homework04.NumbersChecker;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserve.edu.homework04.NumbersChecker.IntChecker;

public class IntCheckerTest {

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
	public void test1() {
		IntChecker int1 = new IntChecker(20);
		IntChecker int2 = new IntChecker(400);
		IntChecker int3 = new IntChecker(1);
		IntChecker int4 = new IntChecker(99999);

		int actualMax;
		int expectedMax = 99999;
		actualMax=int1.getMax();
		Assert.assertEquals(expectedMax, actualMax);
		
		int actualMin;
		int expectedMin = 1;
		actualMin=int1.getMin();
		Assert.assertEquals(expectedMin, actualMin);
		
		int4.resetCounter();
		
	}

	@Test
	public void test2() {
		IntChecker int1 = new IntChecker(1);
		IntChecker int2 = new IntChecker(0);
		IntChecker int3 = new IntChecker(19995456);
		IntChecker int4 = new IntChecker(194340);

		int actualMax;
		int expectedMax = 19995456;
		actualMax=int1.getMax();
		Assert.assertEquals(expectedMax, actualMax);
		
		int actualMin;
		int expectedMin = 0;
		actualMin=int1.getMin();
		Assert.assertEquals(expectedMin, actualMin);
		
		int4.resetCounter();
	}

	@Test
	public void test3() {
		IntChecker int1 = new IntChecker(999);
		IntChecker int2 = new IntChecker(19);
		IntChecker int3 = new IntChecker(20);
		IntChecker int4 = new IntChecker(100500);

		int actualMax;
		int expectedMax = 100500;
		actualMax=int1.getMax();
		Assert.assertEquals(expectedMax, actualMax);
		
		int actualMin;
		int expectedMin = 19;
		actualMin=int1.getMin();
		Assert.assertEquals(expectedMin, actualMin);
		
		int4.resetCounter();
	}

}