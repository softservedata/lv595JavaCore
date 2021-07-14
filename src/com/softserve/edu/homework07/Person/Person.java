package com.softserve.edu.homework07.Person;

public abstract class Person {
	private String name;
	private double salary;

	public Person(String name) {
		this.name = name;
		System.out.println("Constructr form Person class.");

	}

	public Person(String name, double salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("Constructr form Person class.");
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public abstract void print();

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

}
