package com.softserve.hw4;

public class Main {
	public static void main(String[] args) {
		// Task 1.1
		Numbers n1 = new Numbers();
		n1.ifOdd(4, 2, 7);
		// Task 1.2
		System.out.print("\n");
		n1.week(5);
		// Task 1.3
		System.out.print("\n\n");
		Country c1 = new Country();
		c1.getContinent("Mozambique");
		c1.getContinent("laos");
		c1.getContinent("FINLAND");
		c1.getContinent("CaNaDa");
		c1.getContinent("PerU");
		c1.getContinent("Australia");
		c1.getContinent("Neverland");
		// Task 1.4.1
		Product p1 = new Product("phone", 5000, 5);
		Product p2 = new Product("fridge", 15000, 9);
		Product p3 = new Product("computer", 40000, 8);
		Product p4 = new Product("camera", 3000, 4);

		int[] price = { p1.getPrice(), p2.getPrice(), p3.getPrice(), p4.getPrice() };
		int max = 0;
		for (int i = 1; i < price.length; i++) {
			if (price[i] > price[i - 1]) {
				max = i;
			}
		}

		switch (max) {
		case 0:
			System.out.println("Product: " + p1.getName() + ", Quantity: " + p1.getQuantity());
			break;
		case 1:
			System.out.println("Product: " + p2.getName() + ", Quantity: " + p2.getQuantity());
			break;
		case 2:
			System.out.println("Product: " + p3.getName() + ", Quantity: " + p3.getQuantity());
			break;
		case 3:
			System.out.println("Product: " + p4.getName() + ", Quantity: " + p4.getQuantity());
			break;
		}
		// Task 1.4.2
		int[] quantity = { p1.getQuantity(), p2.getQuantity(), p3.getQuantity(), p4.getQuantity() };
		int max2 = 0;
		for (int i = 1; i < quantity.length; i++) {
			if (quantity[i] > quantity[i - 1]) {
				max2 = i;
			}
		}

		switch (max2) {
		case 0:
			System.out.println("Product: " + p1.getName());
			break;
		case 1:
			System.out.println("Product: " + p2.getName());
			break;
		case 2:
			System.out.println("Product: " + p3.getName());
			break;
		case 3:
			System.out.println("Product: " + p4.getName());
			break;
		}
		
		
		

	}

}
