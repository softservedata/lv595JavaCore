package com.softserve.edu.homework04;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class HttpErrorsTest {

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
	HttpErrors error1 = HttpErrors.BadRequest;
	
	String actualPrompt;
	String expectedPrompt  = "HTTP Error 400 - Bad Request!\n";
	
	actualPrompt=error1.promptError();
	
	Assert.assertEquals(expectedPrompt, actualPrompt);
	
	String actualD;
	String expectedD = "The server could not understand the request due to invalid syntax.";
	
	actualD=error1.getDiscription();
	
	Assert.assertEquals(expectedD, actualD);
	
	}
	
	
	@Test
	public void test2() {
	HttpErrors error1 = HttpErrors.Forbidden;
	
	String actualPrompt;
	String expectedPrompt  = "HTTP Error 403 - Forbidden!\n";
	
	actualPrompt=error1.promptError();
	
	Assert.assertEquals(expectedPrompt, actualPrompt);
	
	String actualD;
	String expectedD = "The client does not have access rights to the content; that is, it is unauthorized, so the server is refusing to \n"
						+ "give the requested resource. Unlike 401, the client's identity is known to the server.";
	
	actualD=error1.getDiscription();
	
	Assert.assertEquals(expectedD, actualD);
	
	}
	@Test
	public void test3() {
	HttpErrors error1 = HttpErrors.NotFound;
	
	String actualPrompt;
	String expectedPrompt  = "HTTP Error 404 - Not Found!\n";
	
	actualPrompt=error1.promptError();
	
	Assert.assertEquals(expectedPrompt, actualPrompt);
	
	String actualD;
	String expectedD = "The server can not find the requested resource. In the browser, this means the URL is not recognized. In an API, \n"
			+ "this can also mean that the endpoint is valid but the resource itself does not exist. Servers may also send this \n"
			+ "response instead of 403 to hide the existence of a resource from an unauthorized client. This response code is \n"
			+ "probably the most famous one due to its frequent occurrence on the web.";
	
	actualD=error1.getDiscription();
	
	Assert.assertEquals(expectedD, actualD);
	
	}
	@Test
	public void test4() {
	HttpErrors error1 = HttpErrors.Unauthorized;
	
	String actualPrompt;
	String expectedPrompt  = "HTTP Error 401 - Unauthorized!\n";
	
	actualPrompt=error1.promptError();
	
	Assert.assertEquals(expectedPrompt, actualPrompt);
	
	String actualD;
	String expectedD = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, \n"
			+ "the client must authenticate itself to get the requested response.";
	
	actualD=error1.getDiscription();
	
	Assert.assertEquals(expectedD, actualD);
	
	}

}
