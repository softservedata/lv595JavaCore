package com.softserve.edu.homework07.Salary.Person;

public class Teacher extends Staff {
	
	private final String TYPE_PERSON = "Teacher";
	
	public Teacher(String name, double salary) {
		super(name, salary);
		System.out.println("Constructr form Teacher class.");
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
		return "Teacher [" + super.toString() + "]";
	}
	
	
}
