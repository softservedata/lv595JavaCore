package com.softserve.lesson5;

import java.util.Scanner;

public class HomeTask3 {

    public static void main(String[] args) {
        int index = 0;
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integer numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                index += 1;
            if (index == 2 && arr[i] > 0)
                System.out.println("Second positive number is : " + arr[i]);
        }
        int min = arr[0];
        int imin = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");


    }
}
