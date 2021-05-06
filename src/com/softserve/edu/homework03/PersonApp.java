package com.softserve.edu.homework03;

import java.util.Scanner;

class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	private static int counter = 0;
	private static int renameCounter = 0;

	public Person() {
		// System.out.println("Creating new person");
		counter++;
		// System.out.println(counter);
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("Creating new person");
		counter++;
		// System.out.println(counter);
	}

	@Override
	public String toString() {
		return "Person [First Name=" + firstName + ", Last Name=" + lastName + ", Year of birth=" + birthYear + ", Age="
				+ getAge() + "]";
	}

	Scanner sc = new Scanner(System.in);

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getAge() {
		int age = 2021 - getBirthYear();
		return age;
	}

	public void input() {

		// System.out.println("when input starts counter = " + counter);
		System.out.println("Input " + counter + " person First Name, Last Name and YOB (space separated): ");
		this.setFirstName(sc.next());
		// System.out.println("Enter Last Name: ");
		this.setLastName(sc.next());
		// System.out.println("Enter Year of Birth: ");
		this.setBirthYear(sc.nextInt());
	}

	public void renameInput() {
		renameCounter++;
		System.out.println("Enter " + renameCounter + " person new First and Last name.");
		this.firstName = sc.next();
		this.lastName = sc.next();
	}

	public void output() {
		System.out.println(this.toString());
	}

	public void changeName(String fn, String ln) {
		this.setFirstName(fn);
		this.setLastName(ln);
	}

	public void changeName(Object input) {
		// TODO Auto-generated method stub
		
	}

}

public class PersonApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Person person1 = new Person(); person1.input(); 
		Person person2= new Person(); person2.input(); 
		Person person3= new Person(); person3.input(); 
		Person person4= new Person(); person4.input(); 
		Person person5= new Person(); person5.input();
		
		
		/*
		Person person1 = new Person("Nazar", "Ivankiv");
		person1.setBirthYear(1995);
		Person person2 = new Person("Chack", "Norris");
		person2.setBirthYear(-999);
		Person person3 = new Person("Piff", "Stiff");
		person3.setBirthYear(1000);
		Person person4 = new Person("NAP", "FAP");
		person4.setBirthYear(2000);
		Person person5 = new Person("pokkk", "kokkk");
		person5.setBirthYear(1990);
		*/
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();

		/*
		System.out.println(person1.getAge()); System.out.println(person2.getAge());
		System.out.println(person3.getAge()); System.out.println(person4.getAge());
		System.out.println(person5.getAge());
		 */
		System.out.println("If you want ot change Firs and Last name enter \"yes\", to continue press \"ENTER\".");
		String condition = scan.nextLine();
		if (condition.equals("yes") || condition.equals("YES")||condition.equals("Yes")) {
			person1.renameInput();
			person2.renameInput();
			person3.renameInput();
			person4.renameInput();
			person5.renameInput();
			
			System.out.println("Persons infomation updated to:");
			
			person1.output();
			person2.output();
			person3.output();
			person4.output();
			person5.output();
		} else {
			System.out.println("Persons information didn't change.");
		}
		
		scan.close();
	}

}
