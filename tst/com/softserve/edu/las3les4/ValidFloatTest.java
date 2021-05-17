package com.softserve.edu.las3les4;

import static org.junit.Assert.*;

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