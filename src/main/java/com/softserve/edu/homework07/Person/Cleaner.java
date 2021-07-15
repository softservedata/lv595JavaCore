package com.softserve.edu.homework07.Person;

public class Cleaner extends Staff {

	private final String TYPE_PERSON = "Cleaner";

	public Cleaner(String name, double salary) {
		super(name, salary);
		System.out.println("Constructr form Cleaner class.");
	}

	@Override
	public void print() {
		System.out.println("\tI'm a " + TYPE_PERSON + " !");
	}

	@Override
	public void salary() {
		super.getSalary();
	}

	@Override
	public String toString() {
		return "Cleaner [" + super.toString() + "]";
	}

}
