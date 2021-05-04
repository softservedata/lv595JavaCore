package com.softserve.edu.jc01;

public class NameAddress {
	public static void nameAddress() {
		System.out.println("What is your name?");
		String name = Main.sc.next();
		System.out.println("Where are you leave, " + name + "?");
		Main.sc.nextLine();
		String address = Main.sc.nextLine();
		System.out.println("Your name is " + name + ". You leave on " + address + " street.\n");
	}

}
