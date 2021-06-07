package com.softserve.edu.homework07.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.softserve.edu.homework07.Person.Student;



public class AnimalApp {
	public static void main(String[] args) {

		IAnimal[] animals = { new Cat("Spike", 3, 35), new Dog("Lucky", 4, 45), new Rabbit("Banny", 1, 13),
				new Dog("Jack", 8, 57), new Cat("Jack", 9, 57), new Rabbit("Jerry", 4, 15) };

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
		
		List<Animal> animalsList = new ArrayList<>();

		animalsList.add(((Animal) animals [0]));
		animalsList.add(((Animal) animals [1]));
		animalsList.add(((Animal) animals [2]));
		animalsList.add(((Animal) animals [3]));
		animalsList.add(((Animal) animals [4]));
		animalsList.add(((Animal) animals [5]));
		
		animalsList.sort(new Animal.NameComparator());
		System.out.println("Compared by name: ");
		for (Animal animal: animalsList) {
			System.out.println("\t" + animal);
		}
		
		////////////////////////////How to run Comparator it it's not declared as STATIC!!!!//////////////////////////////////////
		/////////////////////////Have to declare new object of a class to with comparator belongs....new Animal(), then new AgeComparator()////////////////////////////
		Collections.sort(animalsList, new Animal().new AgeComparator());
		System.out.println("Compared by Age: ");
		Iterator<Animal> castIteration = animalsList.iterator();
		while (castIteration.hasNext()) {
			System.out.println("\tPrinting with castIterator: " + castIteration.next());
		}
		
		animalsList.sort(new Animal.PriceComparator());
		System.out.println("Compared by Price: ");
		for (Animal animal: animalsList) {
			System.out.println("\t" + animal);
		}
		
	}

}
