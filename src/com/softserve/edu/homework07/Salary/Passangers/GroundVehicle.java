package com.softserve.edu.homework07.Salary.Passangers;

public class GroundVehicle  extends Passengers implements Vehicle {

	public GroundVehicle() {
	}

	public GroundVehicle(int passengers) {
		super(passengers);
	}
	
	protected void drive() {
		System.out.println("\tGround vehicle riding!");
	}

	@Override
	public String toString() {
		return "Ground Vehicle";
	}
	
	

}
