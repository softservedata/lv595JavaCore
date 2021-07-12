package com.softserve.lesson10;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter one string : ");
        str1 = scanner.nextLine();
        System.out.println("Enter two string : ");
        str2 = scanner.nextLine();
        int pos = str1.indexOf(str2);
        if (pos > 0)
            System.out.println(str2 + " is present in " + str1);
        else
            System.out.println(str2 + " Not in " + str1);
    }

}
