package com.softserve.edu.homework07_Animal;


public class Animal implements Comparable<Object> {
	
	private String name;
	private int age;
	private int price;
	
	public Animal(String name, int age, int price) {
		this.name=name;
		this.age=age;
		this.price=price;
		System.out.println("\tRunning Animal Constructor.");
	}

	@Override
	public int compareTo(Object obj) {
		if (name.compareTo(((Animal) obj).name) != 0){
			return name.compareTo(((Animal) obj).name);
		} 
		else if ( Integer.compareUnsigned(age, (((Animal) obj).age)) !=0){
			return Integer.compareUnsigned(age, (((Animal) obj).age));
		} 
		else {
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

	
}
