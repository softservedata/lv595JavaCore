package com.softserve.edu.less13java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Pt1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enten int numer: 10");
        int n = 10;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        list = rnd.ints(0, 5).
                limit(n).boxed()
                .collect(Collectors.toList());
        System.out.println("Random: "+list);
//        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println("\nSorted: "+list.stream().sorted().collect(Collectors.toList()));
        Integer max ;//= new Integer();
        max = list.stream().max(Integer::compareTo).get();
        System.out.println("\nThe biggest element: "+max);
    }
}
