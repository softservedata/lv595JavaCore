package com.softserve.edu.homework11.ExceptionsHomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Div {
	public static double div(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
	public static void readNumber(int start, int end) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your number: ");
		int number = Integer.parseInt(br.readLine());
		if ((number >= start) && (number <= end)) {
			System.out.printf("Your number %d is within the given range from %d to %d. ", number, start, end);
		} else {
			System.out.printf("Your number %d is outside the given range from %d to %d. ", number, start, end);
		}
			
	}
}

public class DivApp {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter first number (double): ");
			double number1 = Double.parseDouble(br.readLine());
			System.out.println("Enter second number (double): ");
			double number2 = Double.parseDouble(br.readLine());
			System.out.printf("\tResult of division of %.2f and %.2f is %.4f.\n", number1, number2,
					Div.div(number1, number2));
			
			Div.readNumber(-24, 24);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
