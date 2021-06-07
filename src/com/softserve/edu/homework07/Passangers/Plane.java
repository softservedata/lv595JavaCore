package com.softserve.edu.homework07.Passangers;

public class Plane extends FlyingVehicle {

	private int maxDistance;

	public Plane() {
	}

	public Plane(int passengers, int maxDistance) {
		super(passengers);
		this.maxDistance=maxDistance;
	}

	@Override
	protected void fly() {
		super.fly();
		System.out.println("Plane flying!");
	}

	@Override
	protected void land() {
		super.land();
		System.out.println("Plane land!");
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	public String toString() {
		return super.toString() + ": Plane [Max Distance=" + maxDistance + ", Passengers= " + getPassengers() + "]";
	}
	
	
	
}
