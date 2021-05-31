package com.softserve.edu.homework06_3;

public class Chicken extends NonFlyingBirds{
	
	public Chicken (String name, boolean layEggs) {
		super.name=name;
		super.layEggs=layEggs;
	}

	@Override
	public String toString() {
		return "Chicken [name=" + name + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	@Override
	public void fly() {
	 System.out.println( "Chicken can't fly!!!");	
	}
	
	@Override
	public String getClassName() {
		return "Chicken";
	}
	
}
