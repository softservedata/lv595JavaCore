package com.softserve.edu16dialog;

public class Appl {
	public static void main(String[] args) {
		DialogTime dt = new DialogTime();
		dt.setVisible(true);
		System.out.println("main(): Thread ID = " + Thread.currentThread().getId());
	}
}