package edu.homework06.Lines;

public class PointsAndLinesApp {
	public static void main(String[] args) {

		Line[] lines = { new Line(new Point(12.4f, 19.4f), new Point(12.4f, 19.4f)),
				new Line(new Point(12.4f, 19.4f), new Point(11.1f, 9.7f)),
				new Line(new Point(12.4f, 19.4f), new Point(7.19f, 29.89f)),
				new Line(new Point(12.4f, 19.4f), new Point(24.34f, 11.11f)),
				new ColorLine(new Point(7f, 6f), new Point(5f, 4f), "Red"),
				new ColorLine(new Point(8f, 9f), new Point(11f, 10f), "Orange"),
				new ColorLine(new Point(12f, 13f), new Point(14f, 15f), "Blue"),
				new ColorLine(new Point(19.0342f, 312.234f), new Point(999f, 11.3424f), "Green"), };

		for (Line line : lines) {
			System.out.println(line.toString());
		}

		lines[7].print();
		lines[0].print();

	}
}
