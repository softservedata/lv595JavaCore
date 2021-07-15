package edu.homework07.Salary;

import java.util.Comparator;

public class Employee implements Payment, Comparable<Employee> {

	private double salary;
//	============================================================================================================

	public static class IDAscendComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			int toReturn = 0;
			if ((o1 instanceof ContractEmployee) && (o2 instanceof ContractEmployee)) {
				toReturn = ((ContractEmployee) o1).getFederalTaxIdmember()
						.compareTo(((ContractEmployee) o2).getFederalTaxIdmember());
			} else if ((o1 instanceof SalariedEmployee) && (o2 instanceof SalariedEmployee)) {
				toReturn = ((SalariedEmployee) o1).getSocialSecurityNumber()
						.compareTo(((SalariedEmployee) o2).getSocialSecurityNumber());
			} else if ((o1 instanceof ContractEmployee) && (o2 instanceof SalariedEmployee)) {
				toReturn = ((ContractEmployee) o1).getFederalTaxIdmember()
						.compareTo(((SalariedEmployee) o2).getSocialSecurityNumber());
			} else if ((o2 instanceof ContractEmployee) && (o1 instanceof SalariedEmployee)) {
				toReturn = (((SalariedEmployee) o1).getSocialSecurityNumber()
						.compareTo(((ContractEmployee) o2).getFederalTaxIdmember()));
			}
			return toReturn;
		}
	}

	public static class IDDescensComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			int toReturn = 0;
			if ((o1 instanceof ContractEmployee) && (o2 instanceof ContractEmployee)) {
				toReturn = -((ContractEmployee) o1).getFederalTaxIdmember()
						.compareTo(((ContractEmployee) o2).getFederalTaxIdmember());
			} else if ((o1 instanceof SalariedEmployee) && (o2 instanceof SalariedEmployee)) {
				toReturn = -((SalariedEmployee) o1).getSocialSecurityNumber()
						.compareTo(((SalariedEmployee) o2).getSocialSecurityNumber());
			} else if ((o1 instanceof ContractEmployee) && (o2 instanceof SalariedEmployee)) {
				toReturn = -((ContractEmployee) o1).getFederalTaxIdmember()
						.compareTo(((SalariedEmployee) o2).getSocialSecurityNumber());
			} else if ((o2 instanceof ContractEmployee) && (o1 instanceof SalariedEmployee)) {
				toReturn = -(((SalariedEmployee) o1).getSocialSecurityNumber()
						.compareTo(((ContractEmployee) o2).getFederalTaxIdmember()));
			}
			return toReturn;
		}
	}

	public static class SalaryDescendComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return -Double.compare(o1.getSalary(), o2.getSalary());
		}
	}

//	============================================================================================================

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double salary() {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee: ";
	}

	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.salary, o.salary);
	}

}
