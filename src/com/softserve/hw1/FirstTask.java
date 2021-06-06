package com.softserve.hw1;

import java.util.Scanner;

public class FirstTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a");
		int a = sc.nextInt();
		System.out.println("Please input b");
		int b = sc.nextInt();
		
		int plus = a + b;
		int minus = a - b;
		int mult = a * b;
		int div = a / b;
		
		System.out.println("a + b = " + plus);
		System.out.println("a - b = " + minus);
		System.out.println("a * b = " + mult);
		System.out.println("a / b = " + div);
		
		sc.close();
	}

}
