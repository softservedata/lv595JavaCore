package com.softserve.edu19deb;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Appl {

	public static void main(String[] args) {
		/*-
		 * Here is a block comment with some very special
		 * formatting that I want indent(1) to ignore.
		 * one
		 * 		two
		 * 				three
		 */
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		System.out.print("num=");
		try {
			num = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("I/O Error.");
		}
		Calc calc = new Calc(num);
		System.out.print("Sum Digits=" + calc.sumDigits());
		//Calc calc2 = new Calc(num);
		System.out.print("\nCount Digits=" + calc.countNonZeroDigits());
	}
}
