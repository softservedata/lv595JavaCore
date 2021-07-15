package edu.homework08.Cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppCars {
	public static void main(String[] args) {

		Car.CarBuilder car1 = Car.CarBuilder.buildCar().addColor("Red").addDateOfProduction(LocalDate.now())
				.addEngineCapasity(2.92).addModel("BMW").addPassengerCapasity(2).setisAirConditioning(true);
		System.out.println(car1);

		Car.CarBuilder car2 = Car.CarBuilder.buildCar().addColor("Blue").addDateOfProduction(LocalDate.now())
				.addEngineCapasity(3.01).addModel("VW").addPassengerCapasity(4).setisAirConditioning(false);
		System.out.println(car2);

		Car.CarBuilder car3 = Car.CarBuilder.buildCar().addColor("Yellow").addDateOfProduction(LocalDate.now())
				.addEngineCapasity(1.98).addModel("VW").addPassengerCapasity(5).setisAirConditioning(true);
		System.out.println(car3);

		Car.CarBuilder car4 = Car.CarBuilder.buildCar().addColor("White").addDateOfProduction(LocalDate.now())
				.addEngineCapasity(3.45).addModel("Kia").addPassengerCapasity(6).setisAirConditioning(true);
		System.out.println(car4);

		Car.CarBuilder car5 = Car.CarBuilder.buildCar().addColor("Grey").addDateOfProduction(LocalDate.now())
				.addEngineCapasity(3.75).addModel("Mersedes").addPassengerCapasity(2).setisAirConditioning(false);
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
			System.out.println("Sorted cars: " + car);
		}
	}
}