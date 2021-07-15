package com.softserve.edu.homework01;

public class Calls {
	public static void calls() {
		System.out.println("Enter country 1 call rate and call duration: ");
		float c1 = Main.sc.nextFloat();
		float t1 = Main.sc.nextFloat();
		Main.sc.nextLine();
		System.out.println("Enter country 2 call rate and call duration: ");
		float c2 = Main.sc.nextFloat();
		float t2 = Main.sc.nextFloat();
		Main.sc.nextLine();
		System.out.println("Enter country 3 call rate and call duration: ");
		float c3 = Main.sc.nextFloat();
		float t3 = Main.sc.nextFloat();
		Main.sc.nextLine();
		System.out.println("Price of call to country 1 - " + (c1 * t1));
		System.out.println("Price of call to country 2 - " + (c2 * t2));
		System.out.println("Price of call to country 3 - " + (c3 * t3));
		System.out.println("Total cost - " + (c1 * t1 + c2 * t2 + c3 * t3) + "\n");
	}

}
