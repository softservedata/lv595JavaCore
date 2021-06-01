package com.softserve.edu.homework07_Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class AnimalApp {
	public static void main(String[] args) {

		IAnimal[] animals = { new Cat("Spike", 3, 35), new Dog("Lucky", 4, 45), new Rabbit("Banny", 1, 13),
				new Dog("Jack", 8, 93), new Cat("Jack", 8, 57), new Rabbit("Jerry", 4, 15) };

		for (IAnimal current : animals) {
			current.feed();
			System.out.println(current.voice());
			current.jump();
		}

		Arrays.sort(animals);

		for (IAnimal current : animals) {
			System.out.println(current);
		}
		
		System.out.println("\n\nWorking with lists Now!!!\n\n");
		
		List<Animal> animalsList = new ArrayList<Animal>();

		animalsList.add(new Cat("Spike", 3, 35));
		animalsList.add(new Dog("Lucky", 4, 45));
		animalsList.add(new Rabbit("Banny", 1, 13));
		animalsList.add(new Dog("Jack", 8, 93));
		animalsList.add(new Cat("Jack", 8, 57));
		animalsList.add(new Rabbit("Jerry", 4, 15));
		
		animalsList.sort(new NameComparator());
		System.out.println("Comprared by name: ");
		for (Animal animal: animalsList) {
			System.out.println("\t" + animal);
		}
		
		animalsList.sort(new AgeComparator());
		System.out.println("Compared by Age: ");
		for (Animal animal: animalsList) {
			System.out.println("\t" + animal);
		}
		
		animalsList.sort(new PriceComparator());
		System.out.println("Compared by Price: ");
		for (Animal animal: animalsList) {
			System.out.println("\t" + animal);
		}
		
	}

}
