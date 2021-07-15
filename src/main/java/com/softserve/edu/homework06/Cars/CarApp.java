package com.softserve.edu.homework06.Cars;

public class CarApp {
	public static void main(String[] args) {
		Cars[] cars = { new Sedan("BMW", 220, 2017), new Sedan("Hundai", 190, 2012), new Sedan("Mersedes", 230, 2019),
				new Track("VW", 210, 2018), new Track("Jeep", 180, 2013), new Track("Toyota", 170, 2015), };

		for (Cars car : cars) {
			System.out.println(car.toString());
		}

		cars[0].run();
		cars[0].stop();

		cars[1].run();
		cars[1].stop();

		cars[2].run();
		cars[2].stop();

		cars[3].run();
		cars[3].stop();

		cars[4].run();
		cars[4].stop();

		cars[5].run();
		cars[5].stop();

	}

}
