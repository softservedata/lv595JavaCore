package com.softserve.edu.homework06.Birds;

public class Penguin extends NonFlyingBirds {

	public Penguin(String name, boolean layEggs) {
		super.name = name;
		super.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Penguin [name=" + name + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

	@Override
	public void fly() {
		System.out.println("Penguin can't fly!!!");
	}

	@Override
	public String getClassName() {
		return "Penguin";
	}

}
