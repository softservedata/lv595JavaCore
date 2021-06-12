package com.softserve.edu.less9;

import java.util.Set;
import java.util.TreeSet;

public class Hw1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(12);
        set1.add(33);
        set1.add(101);
        set1.add(405);
        set1.add(999);
        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(23);
        set2.add(101);
        set2.add(23);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
// /*
        SetsVas setsVas = new SetsVas();
        Set<Integer> interSet = new TreeSet<>();
          interSet = setsVas.<Integer>interSets(set1,set2);
        System.out.println("An intersections of sets: " + interSet);
// */
        Set<Integer> unionSet = new TreeSet<>();
        unionSet = setsVas.<Integer>unionSets(set1,set2);
        System.out.println("An union of sets: " + unionSet);


    }
}
