package com.softserve.edu.homework05.Employee;

public class Employee {
	private String name;
	private double salary;
	private int department;

	public Employee(String name, int department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}
