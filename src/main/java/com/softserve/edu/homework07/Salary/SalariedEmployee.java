package com.softserve.edu.homework07.Salary;

public class SalariedEmployee extends Employee implements Payment {

//	Salaried Employee Fields!!!
	private String socialSecurityNumber;
	private int workHours;
	private double rate;

	public SalariedEmployee() {
	}

	public SalariedEmployee(String socialSecurityNumber, int workHours, double rate) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.workHours = workHours;
		this.rate = rate;
		super.setSalary(salary());
	}

	public String toString() {
		return super.toString() + "SalariedEmployee [socialSecurityNumber = " + socialSecurityNumber + ", rate = "
				+ rate + ", workHours = " + workHours + ", salary = " + this.getSalary() + " ]";
	}

	public double salary() {
		return rate * workHours;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
