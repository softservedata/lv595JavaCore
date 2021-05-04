package com.softserve.edu.homework01;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		first: {
			boolean input = true;
			while (input == true) {
				System.out.println("To run the program enter \"yes\". To exit program press \"no\".");
				String command = sc.next();
				if (command.equals("yes") || command.equals("YES") || command.equals("Yes")) {
					try {
						System.out.println("Which program you want to run? \n1 - Do math with two numbers;\n"
								+ "2 - Check your mood;\n3 - Calculate area of circle;\n"
								+ "4 - Where do you leave?\n5 - Check price of calls.");
						int num = sc.nextInt();
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
							System.out.println("Imput out of range!!!");
						}
					} catch (Exception e) {
						sc.nextLine();
						System.out.println("Need to input integer");
					}

				} else if (!command.equals("yes") || command.equals("")) {
					System.out.println("Program closed by user.");
					sc.close();
					break first;
				}
			}

		}
	}
}
