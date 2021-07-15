package com.softserve.edu.homework08.Shape;

import java.util.Collections;
import java.util.List;

public class Circle implements Shape {
	private static int counter = 1;
	private int id;

	public Circle() {
		id = counter;
		counter++;
	}

	@Override
	public void draw(Shape shape) {
		System.out.println(shape);
	}

	@Override
	public void drawAll(Collections shapes) {
		System.out.println(shapes);

	}

	@Override
	public <T extends Shape> void drawAllOffAKind(List<T> shapes) {
		System.out.println(shapes);

	}

	@Override
	public String toString() {
		return "\n\tCircle [ ID: " + id + "]";
	}

}
