package com.softserve.hw3;

public class Employee {
	private String Name;
	private int Rate;
	private int Hours;
	static int totalSum;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRate() {
		return Rate;
	}

	public void setRate(int rate) {
		Rate = rate;
	}

	public int getHours() {
		return Hours;
	}

	public void setHours(int hours) {
		Hours = hours;
	}

	public Employee() {
	}

	public Employee(String name, int rate) {
		Name = name;
		Rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		Name = name;
		Rate = rate;
		Hours = hours;
	}

	public int getSalary() {
		int s = Rate * Hours;
		totalSum = totalSum + s;
		return s;
	}
	
	@Override

	public String toString() {
		return "Employee [Name = " + Name + ", Rate = " + Rate + ", Hours = " + Hours + "]" + "\n Total salary: "
				+ totalSum;
	}
	
	public String toString(int salary) {
		return "Employee [Name = " + Name + ", Rate = " + Rate + ", Hours = " + Hours + ", Salary = " + salary + "]"
				+ "\n Total salary: " + totalSum;
	}

	public void changeRate(int rate) {
		Rate = rate;
		int s = Rate * Hours;
		System.out.print("Your salary: " + s + "\n");
	}

	public void getBonuses(int salary) {
		double b = salary * 0.1;
		System.out.print("Your bonuse: " + b + "\n");

	}

}
