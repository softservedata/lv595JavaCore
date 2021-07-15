package edu.homework07.Passangers;

public class Motorcycle extends GroundVehicle {

	private int maxSpeed;

	public Motorcycle() {
	}

	public Motorcycle(int maxSpeed, int passengers) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	protected void drive() {
		super.drive();
		System.out.println("Motorcycle moving!");
	}

	@Override
	public String toString() {
		return super.toString() + ": Motorcycle [Max Speed=" + maxSpeed + ", Passengers= " + getPassengers() + "]";
	}

}
