package com.softserve.edu10in;

import java.util.Random;

public class Person {

	// private class FullName {
	public class FullName {
		private String firstName;
		private String lastName;

		public FullName() {
			this.firstName = "";
			this.lastName = "";
		}

		public FullName(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			// age =123;
			// System.out.println("FullName age = " + age);
			return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]: " + age;
		}

	}

	// --------------------

	private FullName fullName;
	private int age;

	public Person() {
		fullName = new FullName();
		age = 456;
	}

	public Person(String firsName, String lastName, int age) {
		this();
		fullName.firstName = firsName;
		fullName.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", age=" + age + "]";
	}

	public void run() {
		// final int bound = 100;
		int bound = 100;
		//
		class AgeGenerator {
			private String test = "_empty_";

			void setRandomAge() {
				Random random = new Random();
				// age = random.nextInt(100);
				age = random.nextInt(bound);
				// bound = 20; // Error
			}

			void printRandomNumber() {
				System.out.println("Random Age: " + age + " " + test);
			}
		}
		//
		AgeGenerator ag = new AgeGenerator();
		ag.test = "_Updated_";
		ag.setRandomAge();
		ag.printRandomNumber();
	}
}
