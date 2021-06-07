package com.softserve.edu.homework07.Person;

public class Main {
	public static void main(String[] args) {
		
		Person [] people = {
				new Student("Tom"),
				new Cleaner("Jon", 2345.13),
				new Teacher ("Mike", 4323.93),
				new Cleaner ("Don", 2355.43),
				new Teacher ("Shaun", 4623.98),
				new Student ("Ross")
		};
		
		for (Person person:people) {
			System.out.println(person);
			person.print();
			if (person instanceof Staff) {
				System.out.println("\t\t" + ((Staff) person).getSalary());
			}
		}	
		
	}

}
