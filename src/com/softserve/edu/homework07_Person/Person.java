package com.softserve.edu.homework07_Person;

public abstract class Person {
	private String name;
	private int salary;

	public Person (String name) {
		this.name=name;
		System.out.println("Constructr form Person class.");
		
	}
	
	public Person(String name, int salary) {
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

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}
	

}
