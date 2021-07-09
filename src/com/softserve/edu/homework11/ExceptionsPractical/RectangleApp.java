package com.softserve.edu.homework11.ExceptionsPractical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}

	public MyException() {
	}
}

class Rectangle {

	public static int squareRectangle(int a, int b) throws MyException {
		if (!(a < 0) || !(b < 0)) {
			return a * b;
		} else {
			throw new MyException("Input value below zero!");
		}
	}

}

public class RectangleApp {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter First Number: ");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter Second Number: ");
			int b = Integer.parseInt(br.readLine());
			System.out.println("Square Rectangle equals: " + Rectangle.squareRectangle(a, b));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}
}