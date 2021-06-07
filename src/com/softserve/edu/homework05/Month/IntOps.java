package com.softserve.edu.homework05.Month;

import java.util.Arrays;
import java.util.Scanner;

public class IntOps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Array of numbers if: " + Arrays.toString(numbers));

		int sum = 0;
		int product = 1;

		for (int i = 0; i < (numbers.length / 2); i++) {
			if (numbers[i] >= 0) {
				sum += numbers[i];
				if (i==(numbers.length/2-1)) {
					System.out.println("Sum of first 5 numbers: " + sum);
				}
			} else {
				product = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
				System.out.println("Product of last 5 numbers: " + product);
				break;
			}

		}

	}
}
