package test.java.com.softserv.edu.less14maven;

import main.java.com.softserv.edu.less14maven.IntFind;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntFindTest {
    IntFind intFind;

    @Before
    public void setUp() throws Exception {
        intFind = new IntFind();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void min1() {
        assertEquals(-3, intFind.min(new int[]{0,-3,5}));
    }

    @Test
    public void min2() {
        assertEquals(-121, intFind.min(new int[]{8,-3,-121}));
    }

    @Test
    public void min3() {
        assertEquals(3, intFind.min(new int[]{5,15,3,100}));
    }

    @Test
    public void max1() {
        assertEquals(5, intFind.max(new int[]{0,-3,5}));
    }

    @Test
    public void max2() {
        assertEquals(8, intFind.max(new int[]{8,-3,-121}));
    }

    @Test
    public void max3() {
        assertEquals(99, intFind.max(new int[]{5,15,3,100}));
    }


}