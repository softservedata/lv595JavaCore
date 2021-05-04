package com.softserve.edu.homework03;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Inputting Employees informations
		System.out.println("Enter space separated name rate hours for first employee");
		Employee employee0 = new Employee(input.next(), input.nextInt(), input.nextInt());
		System.out.println("Enter space separated name rate hoursfor second employee");
		Employee employee1 = new Employee(input.next(), input.nextInt(), input.nextInt());
		System.out.println("Enter space separated name rate hours for third employee");
		Employee employee2 = new Employee(input.next(), input.nextInt(), input.nextInt());

		// Printing Employees details
		System.out.println("Employee details");
		System.out.println(employee0.toString());
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());

		// Checking is rates for employees require change
		System.out.println("If you wont to change rates enter \" yes \".");
		String rateChange = input.next();

		if (rateChange.equals("yes") || rateChange.equals("YES")) {

			// Inputting new rates
			System.out.println("Enter new rate for first employee");
			employee0.changeRate(input.nextInt());
			System.out.println("Enter new rate for second employee");
			employee1.changeRate(input.nextInt());
			System.out.println("Enter new rate for third employee");
			employee2.changeRate(input.nextInt());

			// Printing new Employees details
			System.out.println("Employee details");
			System.out.println(employee0.toString());
			System.out.println(employee1.toString());
			System.out.println(employee2.toString());

			// Calculating total salary with new rates
			Employee.setTotSum((int) (employee0.getSalary() + employee1.getSalary() + employee2.getSalary()));

		} else {

			// Calculating total salary with old rates
			Employee.setTotSum((int) (employee0.getSalary() + employee1.getSalary() + employee2.getSalary()));

		}

		// Checking if bonuses need to be added
		System.out.println("If you wont to add bonuses enter \" yes \".");
		String addBonus = input.next();

		if (addBonus.equals("yes") || addBonus.equals("YES")) {

			// Calculating total salary with bonuses
			Employee.setTotSum((int) (employee0.getBonuses() + employee1.getBonuses() + employee2.getBonuses()));

		} else {

		}

		System.out.println("Total salary = " + Employee.getTotSum());

		input.close();

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
