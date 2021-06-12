package com.softserve.edu.less9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetsVasTest extends SetsVas {
    Set<Integer> set1, set2, interSet, unionSet;
    SetsVas setsVas;

    @Before
    public void setUp() throws Exception {
        interSet = new TreeSet<>();
        unionSet = new TreeSet<>();
        set1 = new TreeSet<>();
        set2 = new TreeSet<>();
        set1.add(1);
        set1.add(12);
        set1.add(33);
        set1.add(101);
        set1.add(405);
        set1.add(999);
        set2.add(1);
        set2.add(23);
        set2.add(101);
        set2.add(23);
        setsVas = new SetsVas();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInterSets() {
        Set<Integer> interSet = new TreeSet<>();
        interSet = setsVas.<Integer>interSets(set1,set2);
        Set<Integer> result = new TreeSet<>();
        result.add(1);
        result.add(2);
        result.add(33);
        result.add(44);
        assertEquals(false, interSet.equals(result));
    }

    @Test
    public void testInterSets2() {
        Set<Integer> interSet = new TreeSet<>();
        interSet = setsVas.<Integer>interSets(set1,set2);
        Set<Integer> result = new TreeSet<>();
        result.add(1);
        result.add(101);
        assertEquals(true, interSet.equals(result));
    }

    @Test
    public void testUnionSets() {
        Set<Integer> unionSet = new TreeSet<>();
        unionSet = setsVas.<Integer>unionSets(set1,set2);
        Set<Integer> result = new TreeSet<>();
        result.add(1);
        result.add(12);
        result.add(33);
        result.add(101);
        result.add(405);
        result.add(999);
        result.add(23);
        assertEquals(true, unionSet.equals(result));

    }
}