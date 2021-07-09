package com.softserve.edu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
    private static Calc calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass");
        calc = new Calc();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After");
    }

    @Test
    public void testAdd1() {
        System.out.println("\t\t@Test testAdd1()");
        // int i = 0;
        // i = 10 / i;
        // fail("Not yet implemented");
        //
        //Calc calc = new Calc();
        double actual;
        double expected = 10;
        //
        actual = calc.add(5, 5);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd2()");
        // fail("Not yet implemented");
        //
        //Calc calc = new Calc();
        double actual;
        double expected = 10;
        //
        actual = calc.add(4, 6);
        Assert.assertEquals(expected, actual, 0.001);
    }

}
