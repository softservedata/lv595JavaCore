package edu.homework07.Passangers;

public class Bus extends GroundVehicle {
	private String route;

	public Bus() {
	}

	public Bus(String route, int passengers) {
		super(passengers);
		this.route = route;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	protected void drive() {
		super.drive();
		System.out.println("Bus moving!");
	}

	@Override
	public String toString() {
		return super.toString() + ": Bus [Route= " + route + ", Passengers= " + getPassengers() + "]";
	}

}
