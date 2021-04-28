package com.softserve.homework.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        System.out.println("Standard unit per minute for first country - " + c1);
        System.out.println("Standard unit per minute for second country - " + c2);
        System.out.println("Standard unit per minute for third country - " + c3);
        //
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();
        double t3 = sc.nextDouble();
        System.out.println("First talk countinued " + t1 + " minutes");
        System.out.println("Second talk countinued " + t2 + " minutes");
        System.out.println("Third talk countinued " + t3 + " minutes");
        //
        double v1 = c1*t1;
        double v2 = c2*t2;
        double v3 = c3*t3;
        System.out.println("Value of first phone call - " + v1 );
        System.out.println("Value of first phone call - " + v2 );
        System.out.println("Value of first phone call - " + v3 );
        System.out.println("Value of all talks together - " + (v1+v2+v3));
    }
}
