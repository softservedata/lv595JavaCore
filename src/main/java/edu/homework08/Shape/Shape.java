package edu.homework08.Shape;

import java.util.Collections;
import java.util.List;

public interface Shape {

	<T extends Shape> void drawAllOffAKind(List<T> shapes);

	void drawAll(Collections shapes);

	void draw(Shape shape);
}
