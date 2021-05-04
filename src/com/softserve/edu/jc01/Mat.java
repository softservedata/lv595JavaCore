package com.softserve.edu.jc01;

public class Mat {

	public static void mat() {
		System.out.println("Enter first number: ");
		float a = Main.sc.nextInt();
		System.out.println("Enter second number: ");
		float b = Main.sc.nextInt();

		System.out.println("Sum of two numbers = " + (a + b));
		System.out.println("Diff of two numbers = " + (a - b));
		System.out.println("Mult of two numbers = " + (a * b));
		System.out.println("Dev of two numbers = " + (a / b) + "\n");
	}

}
