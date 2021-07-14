package com.softserve.edu.homework08.Cars;

import java.time.LocalDate;

public class Car {

	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passengerCapasity;
	private boolean isAirConditioning;

	private Car() {

	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passengerCapasity=" + passengerCapasity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

	public static class CarBuilder extends Car {

		private CarBuilder() {
		}

		public static CarBuilder buildCar() {
			return new CarBuilder();
		}

		public CarBuilder addModel(String model) {
			((Car) this).model = model;
			return this;
		}

		public CarBuilder addDateOfProduction(LocalDate date) {
			((Car) this).dateOfProduction = date;
			return this;
		}

		public CarBuilder addEngineCapasity(double capasity) {
			((Car) this).engineCapacity = capasity;
			return this;
		}

		public CarBuilder addColor(String color) {
			((Car) this).color = color;
			return this;
		}

		public CarBuilder addPassengerCapasity(int passengers) {
			((Car) this).passengerCapasity = passengers;
			return this;
		}

		public CarBuilder setisAirConditioning(boolean isAC) {
			((Car) this).isAirConditioning = isAC;
			return this;
		}

		@Override
		public String toString() {
			return "CarBuilder [" + super.toString() + "]";
		}
	}

	public String getModel() {
		return model;
	}

	public LocalDate getDateOfProduction() {
		return dateOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public String getColor() {
		return color;
	}

	public int getPassengerCapasity() {
		return passengerCapasity;
	}

	public boolean isAirConditioning() {
		return isAirConditioning;
	}

}
