package com.softserve.edu.homework03;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter space separated name rate hours for first employee");
		Employee employee0 = new Employee(input.next(), input.nextInt(), input.nextInt());
		System.out.println("Enter space separated name rate hoursfor second employee");
		Employee employee1 = new Employee(input.next(), input.nextInt(), input.nextInt());
		System.out.println("Enter space separated name rate hours for third employee");
		Employee employee2 = new Employee(input.next(), input.nextInt(), input.nextInt());

		System.out.println("Employee details");
		System.out.println(employee0.toString());
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		
		/*
		System.out.println("Calculating salaries");
		System.out.println(employee0.getSalary());
		System.out.println(employee1.getSalary());
		System.out.println(employee2.getSalary());
		*/
		Employee.setTotSum((int) (employee0.getSalary() + employee1.getSalary() + employee2.getSalary()));
		System.out.println("Total salaries= " + Employee.totSum);
		
		//Changing rates for all employees
		System.out.println("Enter new rate for first employee"); employee0.changeRate(input.nextInt());
		System.out.println("Enter new rate for second employee"); employee1.changeRate(input.nextInt());
		System.out.println("Enter new rate for third employee"); employee2.changeRate(input.nextInt());
		
		input.close();

		System.out.println("Employee details");
		System.out.println(employee0.toString());
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());

		Employee.setTotSum((int) (employee0.getBonuses()+employee1.getBonuses()+employee2.getBonuses()));
		System.out.println("Total salary = " + Employee.getTotSum());
	}
}

class Employee {
	// Scanner input = new Scanner(System.in);
	private String name;
	private int rate;
	private int hours;
	static int totSum;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getRate() {
		return rate;
	}

	void setRate(int rate) {
		this.rate = rate;
	}

	int getHours() {
		return hours;
	}

	void setHours(int hours) {
		this.hours = hours;
	}

	static int getTotSum() {
		return totSum;
	}

	static void setTotSum(int totSum) {
		Employee.totSum = totSum;
	}

	Employee() {
	};

	Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	int getSalary() {
		int salary = rate * hours;
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	int changeRate(int rate) {
		this.rate = rate;
		int salary = hours * rate;
		return salary;
	}

	int getBonuses() {
		return (int) (getSalary() * 1.1);
	}
}
