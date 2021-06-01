package com.softserve.edu.homework07_Person;

public abstract class Staff extends Person{
	
	
	public Staff(String name, int salary) {
		super (name, salary);
		System.out.println("Constructr form Staff class.");
	}

	@Override
	public abstract void print();
	
	public abstract void salary();

	@Override
	public String toString() {
		return "Staff [" + super.toString() + "]";
	}
	
	

}
