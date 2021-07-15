package edu.homework07.Passangers;

public class Boat extends WaterVehicle {

	private int volume;

	public Boat() {
	}

	public Boat(int volume, int passengers) {
		super(passengers);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	protected void isSailing() {
		super.isSailing();
		System.out.println("Boat is sailing!");
	}

	@Override
	public String toString() {
		return super.toString() + ": Boat [Volume=" + volume + ", Passengers= " + getPassengers() + "]";
	}

}
