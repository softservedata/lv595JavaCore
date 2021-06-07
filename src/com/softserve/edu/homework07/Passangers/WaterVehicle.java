package com.softserve.edu.homework07.Passangers;

public class WaterVehicle extends Passengers implements Vehicle {

	public WaterVehicle() {
	}

	public WaterVehicle(int passengers) {
		super(passengers);
	}

	protected void isSailing() {
		System.out.println("\tWater vehicle is sailing!");	
	}

	@Override
	public String toString() {
		return "Water Vehicle";
	}
	
	
}
