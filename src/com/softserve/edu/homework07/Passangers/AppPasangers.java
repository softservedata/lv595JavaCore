package com.softserve.edu.homework07.Passangers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppPasangers {
	public static void main(String[] args) {
		
		List <Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Car("BMW", 4));
		vehicles.add(new Motorcycle(245, 2));
		vehicles.add(new Bus("LA - Nevada", 34));
		vehicles.add(new Helicopter(8, 1300, 3000));
		vehicles.add(new Plane(192, 67000));
		vehicles.add(new Boat(459, 39));
		vehicles.add(new Liner(9, 322));
		
		for (Vehicle current : vehicles) {
			System.out.println(current);
			if (current instanceof GroundVehicle) {
				((GroundVehicle) current).drive();
			}else if (current instanceof FlyingVehicle) {
				((FlyingVehicle) current).fly();
				((FlyingVehicle) current).land();
			} else {
				((WaterVehicle) current).isSailing();
			}
		}

		Collections.sort(vehicles, new Passengers.PassengerComparator());
//		vehicles.sort(new Passengers.PassengerComparator());
		System.out.println("\n\tPrintting list of vehicles sorted by # of passengers.");
		for (Vehicle current : vehicles) {
			System.out.println(current);
		}
	}
}
