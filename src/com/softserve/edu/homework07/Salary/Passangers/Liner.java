package com.softserve.edu.homework07.Salary.Passangers;

public class Liner extends WaterVehicle {

	private int floors;

	public Liner() {
	}

	public Liner(int floors, int passengers) {
		super(passengers);
		this.floors=floors;
	}

	@Override
	protected void isSailing() {
		super.isSailing();
		System.out.println("Liner is sailing!");
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	@Override
	public String toString() {
		return super.toString() + ": Liner [Floors=" + floors + ", Passengers= " + getPassengers() + "]";
	}

	
	
}
