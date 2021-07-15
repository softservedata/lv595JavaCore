package com.softserve.edu.homework03;

import java.util.Scanner;

class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	private static int counter = 0;
	private static int renameCounter = 0;

	public Person() {
		counter++;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		counter++;
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
		System.out.println("Input " + counter + " person First Name, Last Name and YOB (space separated): ");
		this.setFirstName(sc.next());
		this.setLastName(sc.next());
		this.setBirthYear(sc.nextInt());
	}

	public void renameInput() {
		System.out.println("Enter " + ++renameCounter + " person new First and Last name.");
		this.firstName = sc.next();
		this.lastName = sc.next();
		if (renameCounter == counter) {
			renameCounter = 0;
		}
	}

	public void renameInputFirst() {
		System.out.println("Enter " + ++renameCounter + " person new First.");
		this.firstName = sc.next();
		if (renameCounter == counter) {
			renameCounter = 0;
		}
	}

	public void renameInputLast() {
		System.out.println("Enter " + ++renameCounter + " person new Last name.");
		this.lastName = sc.next();
		if (renameCounter == counter) {
			renameCounter = 0;
		}
	}

	public void output() {
		System.out.println(this);
	}

	public void changeName(String fn, String ln) {
		this.setFirstName(fn);
		this.setLastName(ln);
	}

	public void changeFirst(String fn) {
		this.setFirstName(fn);
	}

	public void changeLast(String ln) {
		this.setLastName(ln);
	}

}

public class PersonApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Type \"yes\" if you wan tot add person. Press \"Enter\" to continue.");
		while (scan.nextLine().toLowerCase().equals("yes")) {
			Person person = new Person();
			person.input();
			System.out.println(person);
		}
		/*
		 * Person person1 = new Person("Nazar", "Ivankiv"); person1.setBirthYear(1995);
		 * Person person2 = new Person("Chack", "Norris"); person2.setBirthYear(-999);
		 * Person person3 = new Person("Piff", "Stiff"); person3.setBirthYear(1000);
		 * Person person4 = new Person("NAP", "FAP"); person4.setBirthYear(2000); Person
		 * person5 = new Person("pokkk", "kokkk"); person5.setBirthYear(1990);
		 * 
		 * 
		 * person1.output(); person2.output(); person3.output(); person4.output();
		 * person5.output();
		 */
		/*
		 * System.out.println(person1.getAge()); System.out.println(person2.getAge());
		 * System.out.println(person3.getAge()); System.out.println(person4.getAge());
		 * System.out.println(person5.getAge());
		 */
		/*
		 * while (1 > 0) {
		 * System.out.println("If you want to change persons information enter:\n" +
		 * "\"First\" - to change First name \n\"Last\" - to chnage Last Name \n" +
		 * "\"Both\" - to change First and Last Name \nTo continue without changes press \"ENTER\"."
		 * ); String condition = scan.nextLine(); if
		 * (condition.toLowerCase().equals("both") ) { person1.renameInput();
		 * person2.renameInput(); person3.renameInput(); person4.renameInput();
		 * person5.renameInput();
		 * 
		 * System.out.println("Persons infomation updated to:");
		 * 
		 * person1.output(); person2.output(); person3.output(); person4.output();
		 * person5.output();
		 * 
		 * } else if (condition.toLowerCase().equals("first")) {
		 * person1.renameInputFirst(); person2.renameInputFirst();
		 * person3.renameInputFirst(); person4.renameInputFirst();
		 * person5.renameInputFirst();
		 * 
		 * System.out.println("Persons infomation updated to:");
		 * 
		 * person1.output(); person2.output(); person3.output(); person4.output();
		 * person5.output();
		 * 
		 * } else if (condition.toLowerCase().equals("last")) {
		 * person1.renameInputLast(); person2.renameInputLast();
		 * person3.renameInputLast(); person4.renameInputLast();
		 * person5.renameInputLast();
		 * 
		 * System.out.println("Persons infomation updated to:");
		 * 
		 * person1.output(); person2.output(); person3.output(); person4.output();
		 * person5.output();
		 * 
		 * } else { System.out.println("Persons information didn't change."); break; }
		 * 
		 * }
		 * 
		 */
		scan.close();
	}
}
