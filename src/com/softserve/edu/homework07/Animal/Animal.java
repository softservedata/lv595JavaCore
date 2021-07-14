package com.softserve.edu.homework07.Animal;

import java.util.Comparator;

public class Animal implements Comparable<Object> {

	private String name;
	private int age;
	private int price;

	public Animal(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
		System.out.println("\tRunning Animal Constructor.");
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object obj) {
		if (name.compareTo(((Animal) obj).name) != 0) {
			return name.compareTo(((Animal) obj).name);
		} else if (Integer.compareUnsigned(age, (((Animal) obj).age)) != 0) {
			return Integer.compareUnsigned(age, (((Animal) obj).age));
		} else {
			return Integer.compareUnsigned(price, (((Animal) obj).price));
		}
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	int getPrice() {
		return price;
	}

	static class NameComparator implements Comparator<Animal> {

		@Override
		public int compare(Animal o1, Animal o2) {
			if (o1.getName().compareTo(o2.getName()) != 0) {
				return o1.getName().compareTo(o2.getName());
			} else if ((o1.getAge() - o2.getAge()) != 0) {
				return o1.getAge() - o2.getAge();
			} else {
				return o1.getPrice() - o2.getPrice();
			}
		}

	}

	//////////////////// Running AgaComparator from non-static
	//////////////////// class///////////////////////////
	public class AgeComparator implements Comparator<Animal> {

		@Override
		public int compare(Animal o1, Animal o2) {
			if ((o1.getAge() - o2.getAge()) != 0) {
				return o1.getAge() - o2.getAge();
			} else if (o1.getName().compareTo(o2.getName()) != 0) {
				return o1.getName().compareTo(o2.getName());
			} else {
				return -(o1.getPrice() - o2.getPrice());
			}
		}

	}

	public static class PriceComparator implements Comparator<Animal> {

		public PriceComparator() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int compare(Animal o1, Animal o2) {

			int nameCompare = o1.getName().compareTo(o2.getName());
			int ageCompare = o1.getAge() - o2.getAge();
			int priceCompare = o1.getPrice() - o2.getPrice();

			return (priceCompare == 0) ? ((nameCompare == 0) ? ageCompare : nameCompare) : priceCompare;
		}

	}

}
