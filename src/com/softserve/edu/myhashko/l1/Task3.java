package com.softserve.edu.myhashko.l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results. */

public class Task3 {
    public static void main(String[] args) throws IOException {
        double radius;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Provide value for radius: ");
        radius = Double.valueOf(br.readLine());

        double area = Math.PI * radius;

        System.out.println("The circle area is: " + area);


    }
}