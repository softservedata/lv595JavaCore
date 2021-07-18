package com.softserve.lesson9.taskSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> res = new TreeSet<>(set1);
        res.addAll(set2);
        return res;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> res = new TreeSet<>(set1);
        res.retainAll(set2);
        return res;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        set1.add(5);
        set1.add(11);
        set1.add(25);
        set1.add(17);
        set1.add(9);
        set1.add(27);
        set2.add(11);
        set2.add(14);
        set2.add(1);
        set2.add(8);
        set2.add(27);
        set2.add(3);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set union " + Application.union(set1, set2));
        System.out.println("Set intersection " + Application.intersect(set1, set2));

    }
}
