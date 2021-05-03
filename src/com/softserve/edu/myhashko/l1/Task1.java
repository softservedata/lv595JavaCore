package com.softserve.edu.myhashko.l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Define integer variables a and b. Read values a and b from Console and calculate: a+b, a-b, a*b, a/b. */

public class Task1 {
    public static void main(String[] args) throws IOException {
        double a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Provide value for a: ");
        a = Double.valueOf(br.readLine());
        System.out.print("Provide value for b: ");
        b = Double.valueOf(br.readLine());
        System.out.println("Values for a: " + a + ", b: " + b);

        double result = a + b;
        System.out.println("Result for a+b is: " + result);
        result = a * b;
        System.out.println("Result for a*b is: " + result);
        result = a - b;
        System.out.println("Result for a-b is: " + result);
        result = a / b;
        System.out.println("Result for a/b is: " + result);
    }
}