package com.softserve.edu.homework04.Dogs;

class Dog {

	private String name;
	private int age;
	private String breed;
	private static int numberOfDogs;
	private static String[] names = new String[100];

	public Dog() {
	}

	public Dog(String name, int age) {
		this.name = name;
		names[numberOfDogs] = name;
		numberOfDogs++;
		this.age = age;
	}
	public void resetCounter() {
		numberOfDogs=0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		names[numberOfDogs] = name;
		numberOfDogs++;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(Object breed) {
		this.breed = breed.toString();
//		System.out.println("Done assigning breed: " + this.breed);
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	public String namesChecker() {
		String string = null;
		int checker = 0;
//		System.out.println(numberOfDogs);
		for (int j = 0; j < numberOfDogs; j++) {
			for (int k = j + 1; k < numberOfDogs; k++) {
//				System.out.println(names[k]);
				if (names[k] != null && names[j].equals(names[k])) {
					string = "Dogs have same names! Duplicate name is " + names[k] + "!";
					checker++;
//					System.out.println("Incremented checker");
				}
			}
		}
		if (checker == 0) {
			string = "All names are different!";
		}
		return string;
	}

	public String theOldest(Dog... dogs) {
		String string="";
		int oldest = 0;
		for (Dog dog : dogs) {
			if (dog.getAge() > oldest) {
				oldest = dog.getAge();
			}
			
		}
		for (Dog dog : dogs) {
			if (oldest == dog.getAge()) {
				string += "Oldest dog's name - " + dog.getName() + ". " + "It's breed is - " + dog.getBreed() + ".\n";
			}

		}
		return string;
	}
}
