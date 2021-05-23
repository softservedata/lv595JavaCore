package com.softserve.edu.homework06_2;

public class ColorLine extends Line{
	
	private String color;
	
	public ColorLine (Point point1, Point point2, String color) {
		super(point1, point2);
		this.color=color;
		
	}
	

	@Override
	public String toString() {
		return "ColorLine [" + super.toString() + ", Color=" + color + "]";
	}

	public void print() {
		System.out.println("Printing from ColorLine class: \n" + toString());
	}
}
