package com.softserve.edu.myhashko.l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? Input all source data from console, make calculations and output to the screen. */

public class Task5Alternative {
    public static void main(String[] args) throws IOException {
        double Ukraine, Poland, Romania; /* c1 is Ukraine, c2 is Poland, c3 is Romania */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Provide the tariff value for Ukraine: ");
        Ukraine = Double.valueOf(br.readLine());
        System.out.print("Provide the tariff value for Poland: ");
        Poland = Double.valueOf(br.readLine());
        System.out.print("Provide the tariff value for Romania: ");
        Romania = Double.valueOf(br.readLine());

        double t1 = 1;
        double t2 = 5;
        double t3 = 10;

        double result = Ukraine * t1;
        System.out.println("Price for Ukraine, 1 minute is: " + result);
        result = Ukraine*t2;
        System.out.println("Price for Ukraine, 5 minutes is: " + result);
        result = Ukraine*t3;
        System.out.println("Price for Ukraine, 10 minutes is: " + result);
        result = Poland*t1;
        System.out.println("Price for Poland, 1 minute is: " + result);
        result = Poland*t2;
        System.out.println("Price for Poland, 5 minutes is: " + result);
        result = Poland*t3;
        System.out.println("Price for Poland, 10 minutes is: " + result);
        result = Romania*t1;
        System.out.println("Price for Romania, 1 minute is: " + result);
        result = Romania*t2;
        System.out.println("Price for Romania, 5 minutes is: " + result);
        result = Romania*t3;
        System.out.println("Price for Romania, 10 minutes is: " + result);
    }
}