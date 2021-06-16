package com.softserve.edu.homework08.CarsBuildWithInterface;

import java.time.LocalDate;

public class AppCars {
	public static void main(String[] args) {

		ICar car1 = Car.getCar().setModel("BMW").setDateOfProduction(LocalDate.now()).setEngineCapasity(3.1)
				.setColor("Red").setPassengerCapasity(3).setIsAirConditioned(true).buildCar();
		System.out.println(car1);

	}

}
