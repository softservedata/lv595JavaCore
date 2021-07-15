package test.java.com.softserv.edu.less14maven;

import main.java.com.softserv.edu.less14maven.ValidFloat;

import static org.junit.Assert.assertEquals;

public class ValidFloatTest {
    ValidFloat validFloat;

    @org.junit.Before
    public void setUp() throws Exception {
        validFloat = new ValidFloat(-5f,5f);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void validFloat() {
//         ValidFloat validFloat = new ValidFloat(-5f,5f);
         assertEquals(true, validFloat.validFloat(-3.5f));
    }

    @org.junit.Test
    public void validFloat2() {
//        ValidFloat validFloat = new ValidFloat(-5f,5f);
        assertEquals(true, validFloat.validFloat(4.9f));
    }

    @org.junit.Test
    public void validFloat3() {
//        ValidFloat validFloat = new ValidFloat(-5f,5f);
        assertEquals(false, validFloat.validFloat(8f));
    }

}