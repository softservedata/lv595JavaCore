package edu.homework01;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Initialize boolean and set cycle so user is able to run application non stop
		boolean input = true;
		while (input == true) {
			System.out.println("To run the program enter \"yes\". To exit program press \"no\".");
			String command = sc.next();

			if (command.equals("yes") || command.equals("YES") || command.equals("Yes")) {

				// Try to handle exceptions when no integer inputed
				try {
					System.out.println("Which program you want to run? \n1 - Do math with two numbers;\n"
							+ "2 - Check your mood;\n3 - Calculate area of circle;\n"
							+ "4 - Where do you leave?\n5 - Check price of calls.");
					int num = sc.nextInt();
					// Running program based on user input, break after execution to allow user
					// start new program
					switch (num) {
					case 1:
						Mat.mat();
						break;
					case 2:
						Mood.mood();
						break;
					case 3:
						CircleArea.circleArea();
						break;
					case 4:
						NameAddress.nameAddress();
						;
						break;
					case 5:
						Calls.calls();
						break;
					default:
						// If input our of range [1:5] user asked to enter new value
						System.out.println("Imput out of range!!!");
					}
				}
				// Ask user to enter new value if no integer in input
				catch (Exception e) {
					sc.nextLine();
					System.out.println("Need to input integer");
				}

			}
			// Allow user to close program with input
			else if (!command.equals("yes") || command.equals("")) {
				System.out.println("Program closed by user.");
				sc.close();
				break;
			}
		}

	}
}
