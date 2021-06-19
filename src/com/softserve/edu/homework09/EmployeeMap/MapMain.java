package com.softserve.edu.homework09.EmployeeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapMain {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		Employee emp1 = new Employee("Ivan", 1111);
		Employee emp2 = new Employee("Paul", 2222);
		Employee emp3 = new Employee("Shaun", 3333);
		Employee emp4 = new Employee("Joe", 4444);
		Employee emp5 = new Employee("Mike", 5555);
		Employee emp6 = new Employee("Matie", 6666);
		Employee emp7 = new Employee("Karen", 7777);

		employeeMap.put(emp1.getID(), emp1.getName());
		employeeMap.put(emp2.getID(), emp2.getName());
		employeeMap.put(emp3.getID(), emp3.getName());
		employeeMap.put(emp4.getID(), emp4.getName());
		employeeMap.put(emp5.getID(), emp5.getName());
		employeeMap.put(emp6.getID(), emp6.getName());
		employeeMap.put(emp7.getID(), emp7.getName());

		System.out.println("\nMy Employee Map: " + employeeMap);

		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter Employee ID to display name: ");
		int input = scan.nextInt();
		if (employeeMap.containsKey(input)) {
			System.out.printf("Emplyee ID: %2d, Employee Name: %s\n", input, employeeMap.get(input));
		} else {
			System.out.printf("Employee with ID: %d. Is in library: %b.\n", input, employeeMap.containsKey(input));
		}

		System.out.print("\nEnter Employee Name to display ID: ");
		String inputName = scan.next();
		if (employeeMap.containsValue(inputName)) {
			for (Entry<Integer, String> entry : employeeMap.entrySet()) {
				if(entry.getValue().equals(inputName)) {
				System.out.printf("Employee Name: %s, Emplyee ID: %d.\n", inputName,
						entry.getKey());
				}
			}
		} else {
			System.out.printf("Employee Name: %s. Is in library: %b.\n", inputName,
					employeeMap.containsValue(inputName));
		}

		scan.close();

	}

}
