package edu.homework07.Animal;

public class Cat extends Animal implements IAnimal, IJump {

	public Cat(String name, int age, int price) {
		super(name, age, price);
		System.out.println("\t\tRunning Cat Constructor.");
	}

	@Override
	public void feed() {
		System.out.println("\tFeeding Cat");

	}

	@Override
	public String voice() {
		return "\t\tKeaw";
	}

	@Override
	public void jump() {
		System.out.println("\t\t\tCat Jumping");
	}

	@Override
	public String toString() {
		return "Cat " + super.toString();
	}
}
