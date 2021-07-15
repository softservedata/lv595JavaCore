package test.java.com.softserv.edu.less14maven;

import main.java.com.softserv.edu.less14maven.HTTPError;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(HTTPError.E400, httpError.knownHTTPError(400));
    }

}