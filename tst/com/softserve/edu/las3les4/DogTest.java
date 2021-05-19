package com.softserve.edu.las3les4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog dog1, dog2, dog3;


    @Before
    public void setUp() throws Exception {
        dog1 = new Dog("Max", Breed.DOG, 2);
        dog2 = new Dog("Max", Breed.SPITZ, 5);
        dog3 = new Dog("Tuzik", Breed.BULLDOG, 4);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sameName1_2() {
        assertEquals(true, dog1.sameName(dog2));
    }

    @Test
    public void sameName2_3() {
        assertEquals(false, dog2.sameName(dog3));
    }

    @Test
    public void sameName3_1() {
        assertEquals(false, dog3.sameName(dog1));
    }

    @Test
    public void oldest() {
        boolean expected = false;
        Dog result;
        result = dog1.oldest(dog2);
        result = result.oldest(dog3);
        assertEquals(result.equals(new Dog("Max", Breed.SPITZ, 55)), false);
        System.out.println("The oldest dog is " + result);

    }
}