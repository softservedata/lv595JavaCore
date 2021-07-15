package edu.homework06.Cars;

public abstract class Cars {
	String model;
	int maxSpeed;
	int yearOfManufacture;

//	public Cars (String model, int maxSpeed, int yearOfManufacure) {
//		this.model=model;
//		this.maxSpeed=maxSpeed;
//		this.yearOfManufacture=yearOfManufacure;
//	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	int getMaxSpeed() {
		return maxSpeed;
	}

	void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	int getYearOfManufacture() {
		return yearOfManufacture;
	}

	void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public abstract void run();

	public abstract void stop();

	@Override
	public String toString() {
		return "Cars [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}
