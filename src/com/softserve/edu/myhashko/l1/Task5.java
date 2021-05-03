package com.softserve.edu.myhashko.l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? Input all source data from console, make calculations and output to the screen. */

public class Task5 {
    public static void main(String[] args) throws IOException {
        double c1, c2, c3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Provide value for с1: ");
        c1 = Double.valueOf(br.readLine());
        System.out.print("Provide value for с2: ");
        c2 = Double.valueOf(br.readLine());
        System.out.print("Provide value for с3: ");
        c3 = Double.valueOf(br.readLine());


        double t1, t2, t3;
        System.out.print("Provide value for t1: ");
        t1 = Double.valueOf(br.readLine());
        System.out.print("Provide value for t2: ");
        t2 = Double.valueOf(br.readLine());
        System.out.print("Provide value for t3: ");
        t3 = Double.valueOf(br.readLine());

        double result = c1 * t1;
        System.out.println("Result for c1*t1 is: " + result);

        result = c1*t2;
        System.out.println("Result for c1*t2 is: " + result);

        result = c1*t3;
        System.out.println("Result for c1*t3 is: " + result);

        result = c2*t1;
        System.out.println("Result for c2*t1 is: " + result);

        result = c2*t2;
        System.out.println("Result for c2*t2 is: " + result);

        result = c2*t3;
        System.out.println("Result for c2*t3 is: " + result);

        result = c3*t1;
        System.out.println("Result for c3*t1 is: " + result);

        result = c3*t2;
        System.out.println("Result for c3*t2 is: " + result);

        result = c3*t3;
        System.out.println("Result for c3*t3 is: " + result);

    }
}