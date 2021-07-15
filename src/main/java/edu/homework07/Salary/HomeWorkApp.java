package edu.homework07.Salary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HomeWorkApp {
	public static void main(String[] args) {

		System.out.println("\n\n\tWorking with Arrays\n\n");
		Employee[] employees = { new SalariedEmployee("GHT6473", 245, 35.45), new ContractEmployee("AGH4593", 10, 350),
				new SalariedEmployee("FFG9310", 331, 32.67), new ContractEmployee("KML0345", 14, 320),
				new SalariedEmployee("FTC2345", 301, 69.69) };

		System.out.println("\n\tPrinting List of employees with salaries\n");
		for (Employee emp : employees) {
			System.out.println(emp);
			System.out.println("This Employee salary is " + emp.salary());
		}

		Arrays.sort(employees);

		System.out.println("\n\tPrinting array sorted by salary\n");

		for (Employee emp : employees) {
			System.out.println(emp);
			System.out.println("This Employee salary is " + emp.salary());
		}

		System.out.println("\n\n\tWorking with List\n\n");
		List<Employee> listEmployee = new ArrayList<>();

		listEmployee.add(new SalariedEmployee("GHT6473", 245, 35.45));
		listEmployee.add(new ContractEmployee("AGH4593", 10, 350));
		listEmployee.add(new SalariedEmployee("FFG9310", 331, 32.67));
		listEmployee.add(new ContractEmployee("KML0345", 14, 320));
		listEmployee.add(new SalariedEmployee("FTC2345", 301, 69.69));

		System.out.println("\n\tIterating through list using Iterator\n");
		Iterator<Employee> iterator = listEmployee.iterator();
		while (iterator.hasNext()) {
			System.out.println("\tEmployee salary is: " + iterator.next().salary());
		}

		System.out.println("\n\tIterating through list using for loop. Sorted with Comparable (compareTo).\n");
		Collections.sort(listEmployee);
		for (Employee current : listEmployee) {
			System.out.println(current.toString());
		}

		listEmployee.sort(new Employee.IDAscendComparator());
		System.out.println("\n\tSorted in Tax number ascend order\n");
		for (Employee current : listEmployee) {
			System.out.println(current.toString());
		}

		listEmployee.sort(new Employee.IDDescensComparator());
		System.out.println("\n\tSorted in Taxs number descend order\n");
		for (Employee current : listEmployee) {
			System.out.println(current.toString());
		}

		listEmployee.sort(new Employee.SalaryDescendComparator());
		System.out.println("\n\tSorted in Salary descend order\n");
		for (Employee current : listEmployee) {
			System.out.println(current.toString());
		}

		Collections.sort(listEmployee, new Employee.IDAscendComparator());
		System.out.println("\n\tSorted in Tax number ascend with order Collections \n");
		for (Employee current : listEmployee) {
			System.out.println(current.toString());
		}

	}
}
