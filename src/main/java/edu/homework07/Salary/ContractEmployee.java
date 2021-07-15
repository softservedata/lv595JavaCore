package edu.homework07.Salary;

public class ContractEmployee extends Employee implements Payment {

//	Contracted Employee Fields!!!
	private String federalTaxIdmember;
	private double dayRate;
	private int workDays;

	public ContractEmployee() {
	}

	public ContractEmployee(String federalTaxIdmember, double dayRate, int workDays) {
		this.federalTaxIdmember = federalTaxIdmember;
		this.dayRate = dayRate;
		this.workDays = workDays;
		super.setSalary(salary());
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [federalTaxIdmember = " + federalTaxIdmember + ", dayRate = "
				+ dayRate + ", workDays = " + workDays + ", salary = " + +this.getSalary() + "]";
	}

	@Override
	public double salary() {
		return dayRate * workDays;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getDayRate() {
		return dayRate;
	}

	public void setDayRate(double dayRate) {
		this.dayRate = dayRate;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

}
