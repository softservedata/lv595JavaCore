package edu.homework06.Birds;

public class FlyingBirds extends Bird {

	@Override
	protected void fly() {
		System.out.println(this.name + " can fly.");
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}
}
