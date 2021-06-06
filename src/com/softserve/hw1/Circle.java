package com.softserve.hw1;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the radius");
		double r = sc.nextDouble();
		double pi = Math.PI;
		double perimeter = 2 * pi * r;
		double area = pi * Math.pow(r, 2);
		
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
		sc.close();
	}

}
