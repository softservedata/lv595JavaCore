package com.softserve.edu.homework07.Salary.Animal;

public class Dog extends Animal implements IAnimal, IJump {

	public Dog(String name, int age, int price) {
		super(name, age, price);
		System.out.println("\t\tRunning Dog Constructor.");
	}

	@Override
	public void feed() {
		System.out.println("\tFeeding Dog");

	}

	@Override
	public String voice() {
		return "\t\tWow";
	}

	@Override
	public void jump() {
		System.out.println("\t\t\tDog Jumping");	
	}
	
	@Override
	public String toString() {
		return "Dog " + super.toString();
	}
}
