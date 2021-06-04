package com.softserve.edu.homework07.Salary.Passangers;

public class Car extends GroundVehicle {

	private String model;

	public Car() {
	}
	

	public Car(String model, int passangers) {
		super(passangers);
		this.model = model;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	protected void drive() {
		super.drive();
		System.out.println("Car is moving!");
	}


	@Override
	public String toString() {
		return super.toString() + ": Car [Model=" + model + ", Passengers= " + getPassengers() + "]";
	}
	
	
}
