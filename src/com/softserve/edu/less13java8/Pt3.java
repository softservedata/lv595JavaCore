package com.softserve.edu.less13java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pt3 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList(new String[] {"Olya", "Nazar", "Ira", "Dmytro", "Natalya", "Oleg", "Paraskeva", "Jura"});

        System.out.println("Origin list: "+ list1);
        list1 = list1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted list: " + list1);

    }
}
