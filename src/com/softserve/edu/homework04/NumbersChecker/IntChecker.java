package com.softserve.edu.homework04.NumbersChecker;

public class IntChecker {
	private int number;
	private int max;
	private int min;
	private static int numberOfNumbers;
	private static int[] numbers = new int[10];

	Reader read = new Reader();

	public IntChecker() {
	}

	public IntChecker(int number) {
		this.number = number;
		numbers[numberOfNumbers] = this.getNumber();
		numberOfNumbers++;
	}

	public void setNumber() {
		this.number = read.scanInt();
		numbers[numberOfNumbers] = this.getNumber();
		numberOfNumbers++;

	}

	public int getNumber() {
		return number;
	}

	public int getMax() {
		max = 0;
		for (int k = 0; k < numberOfNumbers; k++) {
			if (numbers[k] > max) {
				max = numbers[k];
			}
		}
		return max;
	}

	public int getMin() {
		min = this.number;
		for (int k = 0; k < numberOfNumbers; k++) {
			if (numbers[k] < min) {
				min = numbers[k];
			}
		}
		return min;
	}

	public void printMax() {
		System.out.println("Maximum integer value  = " + getMax());
	}

	public void printMin() {
		System.out.println("Minimum integer value  = " + getMin());
	}

	public void resetCounter() {
		numberOfNumbers = 0;
	}
}
