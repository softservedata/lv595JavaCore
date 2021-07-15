package com.softserve.edu.homework06.Birds;

public class Eagle extends FlyingBirds {

	public Eagle(String name, boolean layEggs) {
		super.name = name;
		super.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Eagle [name=" + name + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

	@Override
	public void fly() {
		System.out.println("Eagle can fly!!!");
	}

	@Override
	public String getClassName() {
		return "Eagle";
	}

}
