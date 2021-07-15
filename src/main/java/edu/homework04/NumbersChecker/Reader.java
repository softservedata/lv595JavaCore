package edu.homework04.NumbersChecker;

import java.util.Scanner;

public class Reader {

	Scanner sc = new Scanner(System.in);

	public int scanInt() {
		System.out.println("Enter Integer: ");
		return sc.nextInt();
	}

	public float scanFloat() {
		System.out.println("Enter Float: ");
		return sc.nextFloat();
	}

	public String scanString() {
		System.out.println("Enter String: ");
		return sc.nextLine();
	}

}
