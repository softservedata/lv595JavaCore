package com.softserve.edu.homework06_4;

public class Developer extends Employee {
	private String position;

	public Developer(String name, int age, String position, double salary) {
		super(name, age, salary);
		this.position=position;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	
	public String report() {
		return String.format("Name: %s, Age: %d, Position: %s, Salary: %.2f", super.getName(), super.getAge(), position, super.getSalary());
	}

}
