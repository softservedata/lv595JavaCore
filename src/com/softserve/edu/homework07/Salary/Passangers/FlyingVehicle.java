package com.softserve.edu.homework07.Salary.Passangers;

public class FlyingVehicle extends Passengers implements Vehicle {

	public FlyingVehicle() {
	}

	public FlyingVehicle(int passengers) {
		super(passengers);
	}
	
	protected void fly() {
		System.out.println("\tFlying vehicle flying!");
		
	}
	
	protected void land() {
		System.out.println("\tFlying vehicle landed!");
	}

	@Override
	public String toString() {
		return "Flying Vehicle";
	}

	
	
	
}
