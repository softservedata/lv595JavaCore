package com.softserve.edu.homework06.Cars;

public class Sedan extends Cars {

	public Sedan(String model, int maxSpeed, int yearOfManufacure) {
		super.setModel(model);
		super.setMaxSpeed(maxSpeed);
		super.setYearOfManufacture(yearOfManufacure);
	}

	@Override
	public void run() {
		System.out.println("Sedan " + this.model + " manufectured in " + this.yearOfManufacture + " running.");
	}

	@Override
	public void stop() {
		System.out.println("Sedan " + this.model + " manufectured in " + this.yearOfManufacture + " stopped.");
	}

	@Override
	public String toString() {
		return "Sedan [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}
