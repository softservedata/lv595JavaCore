package com.softserve.edu.homework06.Employee;

public class Employee {

	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String report() {
		return String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	double getSalary() {
		return salary;
	}

}
