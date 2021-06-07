package com.softserve.edu.homework06.Birds;

public class NonFlyingBirds extends Bird{
	
	
	
	@Override
	public void fly() {
	 System.out.println( this.name + " can't fly!!!");	
	}

	@Override
	public String toString() {
		return "NonFlyingBirds [name=" + name + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

}
