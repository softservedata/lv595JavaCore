package com.softserve.edu.homework04_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DogTest {

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
		Dog dog1 = new Dog("Spike", 7);
		Dog dog2 = new Dog("Rocky", 9);
		Dog dog3 = new Dog("Ginger", 9);
		Dog dog4 = new Dog("Fig", 10);
		dog1.setBreed(Breed.Bulldog);
		dog2.setBreed(Breed.Labrador);
		dog3.setBreed(Breed.Retriever);
		dog4.setBreed(Breed.Shepherd);

		String actual1;
		String expected1 = "Oldest dog's name - Fig. It's breed is - Shepherd.\n";

		actual1 = dog1.theOldest(dog1, dog2, dog3, dog4);
//		System.out.println(actual1);
//		System.out.println(expected1);
		Assert.assertEquals(expected1, actual1);

		String actual2;
		String expected2 = "All names are different!";

		actual2 = dog1.namesChecker();
//		System.out.println(actual2);
		
		Assert.assertEquals(expected2, actual2);
		dog1.resetCounter();
	}

	@Test
	public void test2() {
		Dog dog1 = new Dog("Spike", 13);
		Dog dog2 = new Dog("Rocky", 13);
		Dog dog3 = new Dog("Ginger", 4);
		Dog dog4 = new Dog("Rocky", 11);
		dog1.setBreed(Breed.Bulldog);
		dog2.setBreed(Breed.Labrador);
		dog3.setBreed(Breed.Retriever);
		dog4.setBreed(Breed.Shepherd);

		String actual1;
		String expected1 = "Oldest dog's name - Spike. It's breed is - Bulldog.\nOldest dog's name - Rocky. It's breed is - Labrador.\n";

		actual1 = dog1.theOldest(dog1, dog2, dog3, dog4);

		Assert.assertEquals(expected1, actual1);
//		System.out.println(dog1.getName());
//		System.out.println(dog2.getName());
//		System.out.println(dog3.getName());
//		System.out.println(dog4.getName());

		String actual2;
		String expected2 = "Dogs have same names! Duplicate name is Rocky!";

		actual2 = dog1.namesChecker();

		Assert.assertEquals(expected2, actual2);
		dog1.resetCounter();
	}

	@Test
	public void test3() {
		Dog dog1 = new Dog("Spike", 13);
		Dog dog2 = new Dog("Rocky", 9);
		Dog dog3 = new Dog("Ginger", 4);
		Dog dog4 = new Dog("Fig", 1);
		dog1.setBreed(Breed.Bulldog);
		dog2.setBreed(Breed.Labrador);
		dog3.setBreed(Breed.Retriever);
		dog4.setBreed(Breed.Shepherd);

		String actual1;
		String expected1 = "Oldest dog's name - Spike. It's breed is - Bulldog.\n";

		actual1 = dog1.theOldest(dog1, dog2, dog3, dog4);

		Assert.assertEquals(expected1, actual1);

		String actual2;
		String expected2 = "All names are different!";

		actual2 = dog1.namesChecker();

		Assert.assertEquals(expected2, actual2);
		dog1.resetCounter();
	}

}
