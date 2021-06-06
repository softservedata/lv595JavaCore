package com.softserve.hw3;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person () {
	}

	public Person (String FirstName, String SecondName) {
		firstName = FirstName;
		lastName = SecondName;
	}

	
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
	
	public int getAge(int year) {
		int age = 2021 - year;
		return age;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		if (firstName == null) {
			System.out.println("Please input first name");
			firstName = sc.nextLine();
		}
		if (lastName == null) {
			System.out.println("Please input last name");
			lastName = sc.nextLine();
		}
		if (birthYear == 0) {
			System.out.println("Please input birth year");
			birthYear = sc.nextInt();
		}
		sc.close();
	}
	
	public String output() {
		return "Person [Name = " + firstName + ", Last name = " + lastName + ", Birth year = " + birthYear + "]";
	}

	public String output(int age) {
		return "Person [Name = " + firstName + ", Last name = " + lastName + ", Birth year = " + birthYear + ", Age = " + age + "]";
	}
	
	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

}
