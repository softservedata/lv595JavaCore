package com.softserve.edu.homework07_Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.softserve.edu.homework07_Employee.Employee.TabComparator;

public class Main {
	public static void main(String[] args) {
		System.out.println("\n\nWorking with Employees List!\n\n");
		
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Vasya", 15.34));
		list.add(new Employee("Anna", 2.14));
		list.add(new Employee("Alina", 40.67));

		System.out.println("Unsorted!!!");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		
		System.out.println("Sorted by Names.");
		Collections.sort(list, new Employee.NameComparator ());		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("Sorted by TabNumber.");
		Collections.sort(list, new Employee.TabComparator ());		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("\n\nWorking with Employees Array!\n\n");
		
		Employee [] employees = {new Employee("Vasya", 15.34),
				new Employee("Anna", 2.14),
				new Employee("Alina", 40.67)
				
		};
		
		
		System.out.println("Sorted by Names.");
		Arrays.sort(employees,new Employee.NameComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("\nSorted by TabNumber.");
		Arrays.sort(employees,new Employee.TabComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}


	}
}
