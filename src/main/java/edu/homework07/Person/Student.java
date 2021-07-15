package edu.homework07.Person;

public class Student extends Person {

	private final String TYPE_PERSON = "Student";

	public Student(String name) {
		super(name);
		System.out.println("Constructr form Student class.");
	}

	@Override
	public void print() {
		System.out.println("\tI'm a " + TYPE_PERSON + " !");

	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + "]";
	}

}
