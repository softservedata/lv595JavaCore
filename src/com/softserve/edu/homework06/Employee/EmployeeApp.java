package com.softserve.edu.homework06.Employee;





public class EmployeeApp {
	public static void main(String[] args) {

		Employee first = new Employee("Jon", 26, 3473.98d);
		Developer second = new Developer("Ron", 24, "Developer", 4273.98d);

		System.out.println(first);
		System.out.println(first.report());

		System.out.println(second);
		System.out.println(second.report());

//		first = second;
//		
//		System.out.println(first);
//		System.out.println(first.report());
//		
//		System.out.println(second);
//		System.out.println(second.report());
//		
		if (second instanceof Employee) {
			;

			System.out.println(first);
			System.out.println(first.report());

			System.out.println(second);
			System.out.println(second.report());

		}
		
		
		int i = 32;
		double d = 94;
		
	

	}

}
