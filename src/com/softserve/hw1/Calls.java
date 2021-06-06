package com.softserve.hw1;

import java.util.Scanner;

public class Calls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much does a minute of call cost in first counry?");
		int c1 = sc.nextInt();
		System.out.println("How long was the call to first country (in minutes)?");
		int t1 = sc.nextInt();
		System.out.println("How much does a minute of call cost in second counry?");
		int c2 = sc.nextInt();
		System.out.println("How long was the call to second country (in minutes)?");
		int t2 = sc.nextInt();
		System.out.println("How much does a minute of call cost in third counry?");
		int c3 = sc.nextInt();
		System.out.println("How long was the call to third country (in minutes)?");
		int t3 = sc.nextInt();

		int a1 = c1 * t1;
		int a2 = c2 * t2;
		int a3 = c3 * t3;
		int total = a1 + a2 + a3;

		System.out.println("First call: " + a1);
		System.out.println("Second call:  " + a2);
		System.out.println("Third call: " + a3);
		System.out.println("Total: " + total);
		sc.close();
	}
}
