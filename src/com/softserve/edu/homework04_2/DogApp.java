package com.softserve.edu.homework04_2;

public class DogApp {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.setName("Spark");
		dog1.setAge(1);
		dog1.setBreed(Breed.Retriever);
		
		Dog dog2 = new Dog();
		dog2.setName("Spike");
		dog2.setAge(5);
		dog2.setBreed(Breed.Shepherd);
		
		Dog dog3 = new Dog();
		dog3.setName("Pup");
		dog3.setAge(11);
		dog3.setBreed(Breed.Labrador);
		
		Dog dog4 = new Dog();
		dog4.setName("Dollar");
		dog4.setAge(8);
		dog4.setBreed(Breed.Bulldog);
		
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());
		System.out.println(dog4.toString());
		
		System.out.println(dog1.namesChecker());
		System.out.println(dog1.theOldest(dog1, dog2, dog3, dog4));

	}
}
