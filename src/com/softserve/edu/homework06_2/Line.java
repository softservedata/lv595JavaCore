package com.softserve.edu.homework06_2;

public class Line {
	
	Point point1;
	Point point2;
	
	public Line() {
	}
	
	public Line (Point point1, Point point2) {
		this.point1=point1;
		this.point2=point2;
	}

	@Override
	public String toString() {
		return "Line [point1=" + this.point1 + ", point2=" + this.point2 + "]";
	}
	
	public void print() {
		System.out.println("Printing from Line class: \n" + toString());
	}

}
