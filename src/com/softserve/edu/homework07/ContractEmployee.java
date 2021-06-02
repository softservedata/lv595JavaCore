package com.softserve.edu.homework07;

public class ContractEmployee extends Employee implements Payment {

	private double dayRate;
	private int workDays;
	private String federalTaxIdmember;

	public ContractEmployee(String federalTaxIdmember, double dayRate, int workDays) {
		this.federalTaxIdmember = federalTaxIdmember;
		this.dayRate = dayRate;
		this.workDays = workDays;
	}

	@Override
	public double getSalary() {
		System.out.println("\t\tRunning getSalary from ContractEmployee Class");
		return dayRate * workDays;
	}

	double getDayRate() {
		return dayRate;
	}

	void setDayRate(double dayRate) {
		this.dayRate = dayRate;
	}

	int getWorkDays() {
		return workDays;
	}

	void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	@Override
	public String toString() {
		return "ContractEmployee [dayRate=" + dayRate + ", workDays=" + workDays + ", federalTaxIdmember="
				+ federalTaxIdmember + "]";
	}

	String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

}
