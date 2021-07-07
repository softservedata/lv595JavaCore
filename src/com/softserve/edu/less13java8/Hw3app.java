package com.softserve.edu.less13java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Hw3app {
    public static void main(String[] args) {
        Hw3 hw3 = new Hw3();
        hw3.run();

    }
}

class Hw3{
    void run(){
        List<String> list1 = Arrays.asList(new String[] {"Olya", "Nazar", "Ira", "Dmytro", "Natalya", "Oleg", "Paraskeva", "Jura"});
//        List<String> list1 = new ArrayList<>(Arrays.asList(new String[] {"Olya", "Nazar", "Ira", "Dmytro", "Natalya", "Oleg", "Paraskeva", "Jura"}));
        Predicate<String> less5 = s -> (s.length() > 4);
        List<String> list2 = list1.stream()
                .filter(s -> s.length() < 5)
                .collect(Collectors.toList());
//        List<String> list3 = list1;
//                list3.removeIf(s -> (s.length() > 4));//(less5));
        List<String> list3 = new ArrayList<>();
        list1.forEach(list -> list3.add(list));


                        //removeIf(s -> {length() >4});
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list1 -> list3: " + list3);
        list3.removeIf(s -> (s.length() > 4));//(less5));
        System.out.println("list3 length < 5: " + list3);

    }
}