package com.softserve.edu08;

public class ApplForm {
	public static void main(String[] args) {
		
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};
		//
		System.out.println(formula.calculate(100)); // 100.0
		System.out.println(formula.sqrt(16)); // 4
	}
}
