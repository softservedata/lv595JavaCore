package com.softserve.edu.homework07.Salary.Animal;

public class Rabbit extends Animal implements IAnimal, IJump{

	public Rabbit(String name, int age, int price) {
		super(name, age, price);
		System.out.println("\t\tRunning Rabbit Constructor");
	}

	@Override
	public void jump() {
		System.out.println("\t\t\tRabbit Jumping");
		
	}
	
	@Override
	public String toString() {
		return "Rabbit " + super.toString();
	}
	
}
