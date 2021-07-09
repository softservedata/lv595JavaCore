package com.softserve.edu11clon;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = new Person("Mike", "Green", 25);
		System.out.println("1. person1 = " + person1);
		Person person2 = (Person) person1.clone();
		System.out.println("1. person2 = " + person2);
		//
		person1.setAge(30);
		person1.getFullName().setFirstName("Michael");
		System.out.println("2. person1 = " + person1);
		System.out.println("2. person2 = " + person2);
	}

}
