package com.softserve.lesson1;

//Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.


import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        double pi = 3.14159265;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius flower bed :");
        int r = scan.nextInt();
        System.out.println("Area flower bed = " + (pi * r * r) );
        System.out.println("Perimeter flower bed = " + (2 * pi * r) );
    }
}
