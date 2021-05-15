package com.softserve.edu.las3les4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HTTPErrorTest {
    HTTPError httpError;

    @Before
    public void setUp() throws Exception {
        httpError = HTTPError.E405;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void knownHTTPError1() {
      assertEquals(HTTPError.E408, httpError.knownHTTPError(408));
    }

    @Test
    public void knownHTTPError2() {
        assertEquals(HTTPError.E401, httpError.knownHTTPError(401));
    }

    @Test
    public void knownHTTPError3() {
        assertEquals(HTTPError.E401, httpError.knownHTTPError(411));
    }

}