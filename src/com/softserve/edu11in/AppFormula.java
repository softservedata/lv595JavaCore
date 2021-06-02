package com.softserve.edu11in;

public class AppFormula {
	public static void main(String[] args) {
		//
		Formula formula = new Formula() {
			@Override
			public double calculate(int x) {
				return sqrt(x * 5);
			}
		};
		//
		double result = formula.calculate(20);
		System.out.println("Square root of 100 is " + result);
	}
}
