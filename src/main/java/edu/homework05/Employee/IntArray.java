package edu.homework05.Employee;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 3 - 12;
		}
		System.out.println(Arrays.toString(numbers));
//	Searching maximum number	
		int max = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}

		}
		System.out.println("Maximum value = " + max);

//	Finding sum off all elements 
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum of all elements = " + sum);

//		Finding amount of negative numbers in array
		int numOfNagative = 0;
		for (int number : numbers) {
			if (number < 0) {
				numOfNagative++;
			}
		}
		System.out.println("Number of negative values = " + numOfNagative);

//		Checking if there's more positive of negative numbers:
		if (numOfNagative < (numbers.length / 2)) {
			System.out.println("Posisitive more then negative");
			System.out.println("Number of positive: " + (numbers.length - numOfNagative));
			System.out.println("Number of negative: " + numOfNagative);
		} else if (numOfNagative > (numbers.length / 2)) {
			System.out.println("Negative more then positive");
			System.out.println("Number of positive: " + (numbers.length - numOfNagative));
			System.out.println("Number of negative: " + numOfNagative);
		} else {
			System.out.println("Equal number of positive and negative");
			System.out.println("Number of positive: " + (numbers.length - numOfNagative));
			System.out.println("Number of negative: " + numOfNagative);
		}

	}

}
