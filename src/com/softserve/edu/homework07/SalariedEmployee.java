package com.softserve.edu.homework07;

public class SalariedEmployee extends Employee implements Payment {
	
	private String socialSecurityNumber;
	private int workHours;
	private double rate;
	
	@Override
	public double getSalary() {
		System.out.println("\t\tRunning getSalary from SalaryEmployee Class");
		return workHours*rate;
	}

	public SalariedEmployee(String socialSecurityNumber, int workHours, double rate) {
		super();
		this.socialSecurityNumber = socialSecurityNumber;
		this.workHours = workHours;
		this.rate = rate;
	}

	String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	int getWorkHours() {
		return workHours;
	}

	void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	double getRate() {
		return rate;
	}

	void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", workHours=" + workHours + ", rate="
				+ rate + "]";
	}
	
}
