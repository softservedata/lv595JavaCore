package com.softserve.edu11in;

public interface Formula {
	double calculate(int a);

	default double sqrt(int x) {
		System.out.println("default double sqrt(int x) running ...");
		return Math.sqrt(x);
	}
}
