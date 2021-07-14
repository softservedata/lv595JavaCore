package com.softserve.edu.homework08.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle());
		shapes.add(new Square());
		shapes.add(new Circle());
		shapes.add(new Square());
		shapes.add(new Circle());
		shapes.add(new Square());
		shapes.add(new Circle());
		shapes.add(new Square());
		shapes.add(new Circle());
		shapes.add(new Square());

		for (Shape current : shapes) {
			current.draw(current);
		}

	}
}
