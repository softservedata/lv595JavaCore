package com.softserve.hw1;

import java.util.Scanner;

public class SecondTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How are you?");
		String answer = sc.nextLine();
		System.out.println("You are " + answer);
		sc.close();
	}

}
