package main.java.com.softserv.edu.less14maven;

import junit.framework.TestSuite;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
/*
import junit.framework.TestCase;
import junit.framework.TestSuite;
*/
/**
 * Unit test for simple App.
 */
public class AppTest 
    //extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public AppTest( String testName )
    {
        super(  );
    }

    public AppTest(  )
    {
//        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return (Test) new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
}
