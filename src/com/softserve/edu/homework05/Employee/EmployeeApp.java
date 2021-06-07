package com.softserve.edu.homework05.Employee;

import java.util.Scanner;

public class EmployeeApp {
	static Scanner sc = new Scanner (System.in);
	
//	Get employees of department
	public static String getEmpOfDepartment(Employee [] arr) {
		String toReturn="";
		System.out.println("Enter depratment numer: ");
		int depNumber = sc.nextInt();
		for (Employee emp:arr) {
			if (emp.getDepartment() == depNumber) {
				toReturn+=emp.toString() + "\n";
			}
		}
		return toReturn;
	}
	
//	Sort employees by salary
	
	public static void sortBySalary(Employee [] arr) {
		Employee temp;
		for (int i = 0; i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i].getSalary() < arr[j].getSalary()) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (Employee emp:arr) {
			System.out.println(emp.toString());
		}
	}
	
	
	
public static void main(String[] args) {
	Employee emp1 = new Employee("Nazar", 1, 2200);
	Employee emp2 = new Employee("Petr", 1, 1900);
	Employee emp3 = new Employee("Mark", 2, 1400);
	Employee emp4 = new Employee("Ross", 2, 1450);
	Employee emp5 = new Employee("Ben", 3, 2400);
	
	Employee [] employees = new Employee [5];
	employees [0] = emp1;
	employees [1] = emp2;
	employees [2] = emp3;
	employees [3] = emp4;
	employees [4] = emp5;
	
	System.out.println(getEmpOfDepartment(employees));
	
	
	sortBySalary(employees);
	
}
}
