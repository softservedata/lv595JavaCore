package com.softserve.edu.homework07.Passangers;

import java.util.Comparator;

public class Passengers implements Comparable<Passengers> {
	private int passengers;

//	=========================================================================================

	static class PassengerComparator implements Comparator <Object> {
		public int compare(Object o1, Object o2) {
			return Integer.compare(((Passengers) o1).passengers, ((Passengers) o2).passengers);
		}

	}

//	=========================================================================================

	public Passengers(int passengers) {
		super();
		this.passengers = passengers;
	}

	public Passengers() {

	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public int compareTo(Passengers o) {
		return Integer.compare(passengers, o.getPassengers());
	}

}
