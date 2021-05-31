package com.softserve.edu.homework06_3;

public class Swallow extends FlyingBirds{
	
	public Swallow (String name, boolean layEggs) {
		super.name=name;
		super.layEggs=layEggs;
	}

	@Override
	public String toString() {
		return "Swallow [name=" + name + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	@Override
	public void fly() {
	 System.out.println( "Swallow can fly!!!");	
	}
	
	@Override
	public String getClassName() {
		return "Swallow";
	}
}
