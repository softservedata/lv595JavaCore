package com.softserve.edu15exc;

public class AppEx {

	static double safeSqrt(double x) throws ArithmeticException {
		if (x < 0.0)
			throw new ArithmeticException();
		return Math.sqrt(x);
	}

	static double foo(double x) {
		double result;
		try {
			result = safeSqrt(x);
		} catch (ArithmeticException e) {
			System.out.println("Error Founded = " + e);
			result = -1;
		}
		System.out.println("result: " + result);
		return result;
	}

	public static void main(String[] args) {
		System.out.println("safeSqrt(4) = " + safeSqrt(4));
		//System.out.println("safeSqrt(-4) = " + safeSqrt(-4));
		System.out.println("safeSqrt(-4) = " + foo(-4));
	}
}
