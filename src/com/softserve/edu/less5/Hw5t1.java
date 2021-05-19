package com.softserve.edu.less5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hw5t1 {

    public static void main(String[] args) throws Exception{
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int expectedMonth;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter month number");
        expectedMonth = Integer.parseInt(br.readLine());
        System.out.println("Number of days is " + daysInMonth[expectedMonth-1]);

    }

}
