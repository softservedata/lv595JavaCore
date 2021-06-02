package com.softserve.edu.homework07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class HomeWorkApp {
public static void main(String[] args) {
	
	System.out.println("\n\n\tWorking with Arrays\n\n");
	Employee [] employees = { 
			new SalariedEmployee("GHT6473", 245, 35.45),
			new ContractEmployee("AGH4593", 10, 350),
			new SalariedEmployee("FFG9310", 331, 32.67),
			new ContractEmployee("KML0345", 14, 320),
			new SalariedEmployee("FTC2345", 301, 69.69)
	};
	
	for (Employee current:employees) {
		System.out.println(current);
		System.out.println("\tEmployee salary is: " + current.getSalary());
	}
	System.out.println("\n\n\tWorking with List\n\n");
	List<Employee> listEmployee = new ArrayList<>();
	
	listEmployee.add(new SalariedEmployee("GHT6473", 245, 35.45));
	listEmployee.add(new ContractEmployee("AGH4593", 10, 350));
	listEmployee.add(new SalariedEmployee("FFG9310", 331, 32.67));
	listEmployee.add(new ContractEmployee("KML0345", 14, 320));
	listEmployee.add(new SalariedEmployee("FTC2345", 301, 69.69));
	
	Iterator<Employee> iterator = listEmployee.iterator();
	while (iterator.hasNext()) {
		System.out.println("\tEmployee salary is: " + iterator.next().getSalary());
	}
}
}
