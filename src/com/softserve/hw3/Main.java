package com.softserve.hw3;

public class Main {
	public static void main(String[] args) {
// Student
		
		Student s1 = new Student("Karina", 72);
		System.out.println(s1.toString());

		Student s2 = new Student("Kyrylo", 99);
		System.out.println(s2.toString());

		Student s3 = new Student("Serhii", 87);
		System.out.println(s3.toString());
		
// Employee 
		
		System.out.println("\n\n");
		Employee e1 = new Employee ("Anna", 60, 168);
		int slr1 = e1.getSalary();
		e1.getBonuses(slr1);
		System.out.println(e1.toString(slr1));
		
		Employee e2 = new Employee ("Maria", 100, 180);
		e2.changeRate(80);
		int slr2 = e2.getSalary();
		System.out.println(e2.toString(slr2));
		
		Employee e3 = new Employee ("Anna", 75, 165);
		int slr3 = e3.getSalary();
		System.out.println(e1.toString(slr3));

// Person  
		
		System.out.println("\n\n");
		Person p1 = new Person ();
		p1.setLastName("Ivanova");
		p1.input();
		System.out.println(p1.output(p1.getAge(p1.getBirthYear())));
		
		Person p2 = new Person ();
		p2.input();
		System.out.println(p2.output(p2.getAge(p2.getBirthYear())));
		
		Person p3 = new Person ();
		p3.input();
		System.out.println(p3.output(p3.getAge(p3.getBirthYear())));
		
		Person p4 = new Person ();
		p4.input();
		System.out.println(p4.output(p4.getAge(p4.getBirthYear())));
		
		Person p5 = new Person ();
		p5.input();
		System.out.println(p5.output(p5.getAge(p5.getBirthYear())));
	}

}
