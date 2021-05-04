package com.softserve.edu.homework03;

public class App {

	public static void main(String[] args) {
	
	Employee employee = new Employee ("Nazar", 23, 8);
	Employee employee1 = new Employee ("Ivan", 2, 5);
	System.out.println(employee1.getSalary());
	System.out.println(employee.getSalary());
	}

}

class Employee {
	private String name;
	private int rate;
	private int hours;
	static int totSum;
	
	Employee (String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	Employee (String name, int rate, int hours){
		this.name=name;
		this.rate=rate;
		this.hours=hours;
	}
	
	int getSalary () {
		int salary = rate * hours;
		return salary;
	}
	
	
	
	
}
