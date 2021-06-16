package com.softserve.edu.homework08.CarsBuildWithInterface;

import java.time.LocalDate;

public interface ICar {
	String getModel();
	LocalDate getDateOfProduction();
	double getEngineCapacity();
	String getColor();
	boolean isAirConditioning();
	int getPassengerCapasity();
	
}
