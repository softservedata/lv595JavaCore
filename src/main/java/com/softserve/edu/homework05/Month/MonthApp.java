package com.softserve.edu.homework05.Month;

import java.util.Arrays;
import java.util.Scanner;

public class MonthApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of monthes: ");
		int[] month = new int[sc.nextInt()];

		for (int i = 0; i < month.length; i++) {
			System.out.print("Enter number of days in this month: ");
			month[i] = sc.nextInt();
		}

		System.out.println("All days in array: " + Arrays.toString(month));

	}

}
