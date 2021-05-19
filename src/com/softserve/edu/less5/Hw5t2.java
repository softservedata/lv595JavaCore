package com.softserve.edu.less5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hw5t2 {

    public static void main(String[] args) throws Exception{
        int[] numbers = {3, 2, -1, 0, 1, 3, -1, 3, -2, 1}; //, 30, 31};
        int result = 0;
        int splitPosithion;
        boolean condition = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Array is: " + Arrays.toString(numbers));
        System.out.print("Split position? : ");
        splitPosithion = Integer.parseInt(br.readLine());

        for (int i=0; condition && i < splitPosithion; i++)
            if (numbers[i] < 0) {
                condition = false;
                result = 1;
            } else
                result += numbers[i];

        for (int i = splitPosithion; !condition && i < numbers.length; i++)
            result *= numbers[i];


        System.out.println("condition is " + condition + ", result = " + result);
    }

}
