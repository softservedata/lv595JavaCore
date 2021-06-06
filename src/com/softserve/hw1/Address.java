package com.softserve.hw1;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Where do you live, " + name + "?");
		String address = sc.nextLine();
		System.out.println("You are " + name + ". You live in " + address + ".");
		
		sc.close();
	}

}
