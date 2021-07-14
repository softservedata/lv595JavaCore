package com.softserve.edu.homework06.Lines;

public class Point {
	private float x;
	private float y;

	Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	float getX() {
		return x;
	}

	void setX(float x) {
		this.x = x;
	}

	float getY() {
		return y;
	}

	void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void print() {
		System.out.println("Printing from point class: \n" + toString());
	}
}
