package com.softserve.edu16io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		System.out.print("Input number: ");
		try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("I/O Error.");
		}
		System.out.println("Number is " + x);
	}

}
