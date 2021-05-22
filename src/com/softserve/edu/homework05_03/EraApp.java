package com.softserve.edu.homework05_03;

import java.util.Arrays;
import java.util.Scanner;

public class EraApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter year here: ");
		int year = sc.nextInt();
		int century;
		
		if (year%100==0) {
			century = year/100;
		} else {
			century = year/100+1;
		}
		
		System.out.println("century = " + century);
		
		
		float [] numbers = new float [20];
		
		numbers[0]=0;
		numbers[1]=0.625f;
		
		System.out.printf("%10.6f\n",numbers[0]);
		System.out.printf("%10.6f\n",numbers[1]);
		
		for (int i = 2; i < numbers.length; i++) {
			
			numbers [i] = ((numbers[(i-1)]/2) + (3/4*numbers[(i-2)]));
			System.out.printf("%10.6f\n",numbers[i]);
		}
		
		System.out.print("Inter number of elements: ");
		int n = sc.nextInt();
		float [] numbers1 = new float [n];
		System.out.print("Enter first element of array: ");
		numbers1 [0]= sc.nextFloat();
		System.out.print("Enter last element of array: ");
		numbers1 [n-1] = sc.nextFloat();
		
		float increment = (numbers1[n-1] - numbers1[0])/n;
		for (int i = 1; i < numbers1.length; i++) {
			numbers1[i] = numbers1 [i-1] + increment;
			System.out.printf("%6.4f\n", numbers1[i]);
		}
		
		
		System.out.print("Enter number a: ");
		float a = sc.nextFloat();
		System.out.print("Enter number b: ");
		float b = sc.nextFloat();
		System.out.print("Enter number c: ");
		float c = sc.nextFloat();
		
		if ((a+b < c) || (b+c < a) || (c+a < b)) {
			System.out.println("0" + "\nCant make triangle out of this values.");
		} else {
			if (a==b && b==c && c==a) {
				System.out.println("3 - rivno stor");
			} else if ( a==b || b==c || a==c){
				System.out.println("2 - rivno bed");
			} else {
				System.out.println("1 - rizni");
			}
		}
		sc.close();
		
	}

}
