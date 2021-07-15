package edu.homework06.Cars;

public class Track extends Cars {
	public Track(String model, int maxSpeed, int yearOfManufacure) {
		super.setModel(model);
		super.setMaxSpeed(maxSpeed);
		super.setYearOfManufacture(yearOfManufacure);
	}

	@Override
	public void run() {
		System.out.println("Track " + this.model + " manufectured in " + this.yearOfManufacture + " running.");
	}

	@Override
	public void stop() {
		System.out.println("Track " + this.model + " manufectured in " + this.yearOfManufacture + " stopped.");
	}

	@Override
	public String toString() {
		return "Track [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}
