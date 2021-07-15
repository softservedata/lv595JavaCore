package edu.homework07.Passangers;

public class Helicopter extends FlyingVehicle {
	private int weight;
	private int maxHight;

	public Helicopter() {
	}

	public Helicopter(int passengers, int weight, int maxHight) {
		super(passengers);
		this.weight = weight;
		this.maxHight = maxHight;
	}

	@Override
	protected void fly() {
		super.fly();
		System.out.println("Helocopter flying!");
	}

	@Override
	protected void land() {
		super.land();
		System.out.println("Helocopter land!");
	}

	@Override
	public String toString() {
		return super.toString() + ": Helicopter [Weight=" + weight + ", Max Hight=" + maxHight + ", Passengers= "
				+ getPassengers() + "]";
	}

}
