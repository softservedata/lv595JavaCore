package com.softserve.lesson13;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(10).forEach(System.out::println);
    }
}
