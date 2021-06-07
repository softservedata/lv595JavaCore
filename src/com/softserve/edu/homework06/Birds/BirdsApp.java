package com.softserve.edu.homework06.Birds;

import java.util.Scanner;

public class BirdsApp {
	public static void main(String[] args) {
		Bird[] birds = { new Eagle("Eddy", true), new Swallow("Sam", false), new Penguin("Joe", false),
				new Chicken("Kim", true) };
		Scanner sc = new Scanner(System.in);

		for (Bird bird : birds) {
			System.out.print("Enter " + bird.getClassName() + " named " + bird.name + " feathers:");
			bird.setFeathers(sc.next());
		}
		
		sc.close();
		
		for (Bird bird : birds) {
			bird.fly();
			System.out.println(bird);
		}

	}

}
