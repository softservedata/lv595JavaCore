package edu.homework05.Month;

import java.util.Arrays;
import java.util.Scanner;

class Car {
	private String type;
	private int yearOfProd;
	private double engCap;

	public Car(String type, int yearOfProd, double engCap) {
		super();
		this.type = type;
		this.yearOfProd = yearOfProd;
		this.engCap = engCap;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public String toString() {
		return "Car [type=" + type + ", year of production=" + yearOfProd + ", engine capasity=" + engCap + "]";
	}

	public int getYearOfProd() {
		return yearOfProd;
	}
}

public class CarApp {

	public static String getByYear(Car[] cars, int year) {
		String toReturn = "";
		for (Car car : cars) {
			if (car.getYearOfProd() == year) {
				toReturn += car.toString() + "\n";
			}
		}
		if (toReturn.equals("")) {
			toReturn = "No cars with this year of production.";
		}
		return toReturn;
	}

	public static String sortByYear(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYearOfProd() > cars[j].getYearOfProd()) {
					Car temp;
					temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}
		}
		return Arrays.toString(cars);
	}

	public static void main(String[] args) {

		Car[] cars = new Car[4];
		cars[0] = new Car("BMW", 2016, 2.7);
		cars[1] = new Car("VW", 2014, 2.3);
		cars[2] = new Car("Mersedes", 2011, 2.9);
		cars[3] = new Car("Porshe", 2018, 3.1);

		System.out.println(getByYear(cars, 2011));
		System.out.println(sortByYear(cars));

	}

}
