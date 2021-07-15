package edu.homework08.CarsBuildWithInterface;

import java.time.LocalDate;

public class Car implements ICarBuilder, ICar, IColor, IDateOfPoduction, IEngineCapacity, IIsAirConditioned,
		IPassengerCapasity, IModel {

	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passengerCapasity;
	private boolean isAirConditioning;

	private Car() {
	}
//	Static method to start creating Car when there's no Instance of a car yet!!!

	public static IModel getCar() { // return next interface that requires user to add information about object.
		return new Car();
	}

//	============================================================================================================================
//	setters
	@Override
	public IDateOfPoduction setModel(String model) {
		this.model = model;
		return this;
	}

	@Override
	public IEngineCapacity setDateOfProduction(LocalDate dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
		return this;
	}

	@Override
	public IColor setEngineCapasity(double engineCapasity) {
		this.engineCapacity = engineCapasity;
		return this;
	}

	@Override
	public IPassengerCapasity setColor(String color) {
		this.color = color;
		return this;
	}

	@Override
	public IIsAirConditioned setPassengerCapasity(int passengerCapasity) {
		this.passengerCapasity = passengerCapasity;
		return this;
	}

	@Override
	public ICarBuilder setIsAirConditioned(boolean isAirConditioned) {
		this.isAirConditioning = isAirConditioned;
		return this;
	}

	@Override
	public ICar buildCar() {
		return this;
	}

//	=====================================================================================================
//	getters

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

	public boolean isAirConditioning() {
		return isAirConditioning;
	}

	@Override
	public int getPassengerCapasity() {
		return passengerCapasity;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passengerCapasity=" + passengerCapasity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

}
