package com.softserve.edu.homework08.Cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppCars {
	public static void main(String[] args) {

		Car.CarBuilder car1 = Car.CarBuilder.getCar();
		car1.addColor("Red");
		car1.addDateOfProduction(LocalDate.now());
		car1.addEngineCapasity(2.92);
		car1.addModel("BMW");
		car1.addPassengerCapasity(2);
		car1.setisAirConditioning(true);
		System.out.println(car1);

		Car.CarBuilder car2 = Car.CarBuilder.getCar();
		car2.addColor("Blue");
		car2.addDateOfProduction(LocalDate.now());
		car2.addEngineCapasity(3.01);
		car2.addModel("VW");
		car2.addPassengerCapasity(4);
		car2.setisAirConditioning(false);
		System.out.println(car2);

		Car.CarBuilder car3 = Car.CarBuilder.getCar();
		car3.addColor("Yellow");
		car3.addDateOfProduction(LocalDate.now());
		car3.addEngineCapasity(1.98);
		car3.addModel("VW");
		car3.addPassengerCapasity(5);
		car3.setisAirConditioning(true);
		System.out.println(car3);

		Car.CarBuilder car4 = Car.CarBuilder.getCar();
		car4.addColor("White");
		car4.addDateOfProduction(LocalDate.now());
		car4.addEngineCapasity(3.45);
		car4.addModel("Kia");
		car4.addPassengerCapasity(6);
		car4.setisAirConditioning(true);
		System.out.println(car4);

		Car.CarBuilder car5 = Car.CarBuilder.getCar();
		car5.addColor("Grey");
		car5.addDateOfProduction(LocalDate.now());
		car5.addEngineCapasity(3.75);
		car5.addModel("Mersedes");
		car5.addPassengerCapasity(2);
		car5.setisAirConditioning(false);
		System.out.println(car5);

		List<Car> cars = new ArrayList<>();

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);

		cars.sort(new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				if (o1.getModel().compareTo(o2.getModel()) != 0) {
					return o1.getModel().compareTo(o2.getModel());
				} else if (o1.getDateOfProduction().compareTo(o2.getDateOfProduction()) != 0) {
					return o1.getDateOfProduction().compareTo(o2.getDateOfProduction());
				} else if (Double.compare(o1.getEngineCapacity(), o2.getEngineCapacity()) != 0) {
					return Double.compare(o1.getEngineCapacity(), o2.getEngineCapacity());
				} else if (o1.getColor().compareTo(o2.getColor()) != 0) {
					return o1.getColor().compareTo(o2.getColor());
				} else {
					return Integer.compare(o1.getPassengerCapasity(), o2.getPassengerCapasity());
				}
			}

		});

		System.out.println("\n\tPrinting sorted\n");
		for (Car car : cars) {
			System.out.println("Printing sorted: " + car);
		}
	}
}