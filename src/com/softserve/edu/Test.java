package com.softserve.edu;

import java.util.Arrays;

public class Test {

public static void main (String[] args){
int[] numbers = { 2, -5, 8, -4, 7 };

        String elements = Arrays.toString(numbers);
        System.out.println("Numbers = " + elements);
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 7);
        elements = Arrays.toString(numbers);

        System.out.println("Numbers = " + elements);
        System.out.println("Position of element with value 7 is " + index);

 }

}