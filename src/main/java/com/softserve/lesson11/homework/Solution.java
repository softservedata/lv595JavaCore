package com.softserve.lesson11.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static double div(double a, double b) {
        double c = a / b;
        try {
            if ((a == 0) || (b == 0))
                throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("A or B = 0!!!");
        } finally {
            System.out.println("Result : " + c);
            return c;
        }

    }

    public static int[] readNumber(int start, int end) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        System.out.println("Read 10 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        try {
            for (int current : arr) {
                if ((current < start) || (current > end))
                    throw new MyException(current);
            }
            if (start == Integer.parseInt("string"))
                throw new NumberFormatException();
        } catch (MyException e) {
            System.out.println("Number must > start and < end !!!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Variable must be Integer!!!");
        } finally {
            for (int i : arr)
            System.out.println("You enter numbers " + i);
            return arr;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Read double a : ");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Read double B : ");
        double b = Double.parseDouble(reader.readLine());
        Solution.div(a, b);

      /*  System.out.println("Read Start : ");
        int start = Integer.parseInt(reader.readLine());
        System.out.println("Read end : ");
        int end = Integer.parseInt(reader.readLine());
        Solution.readNumber(start, end);
        */

    }
}
