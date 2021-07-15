package edu.homework04.NumbersChecker;

public class FloatChecker {
	private float number;

	Reader read = new Reader();

	public FloatChecker() {
	}

	public FloatChecker(float number) {
		this.number = number;
	}

	public float getNumber() {
		return this.number;
	}

	public void setNumber() {
		this.number = read.scanFloat();
	}

	public boolean inRange() {
		System.out.println("Is float " + this.number + " in range [-5:5]? ");
		boolean inRange = false;
		if (number >= -5 && number <= 5) {
			inRange = true;
		}
		return inRange;
	}
}
