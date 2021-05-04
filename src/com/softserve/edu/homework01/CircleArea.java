package com.softserve.edu.homework01;

class CircleArea {

	public static void circleArea() {
		System.out.println("Enter bed radius: ");
		float r = Main.sc.nextFloat();
		System.out.println("Bed length = " + 2 * 3.1415 * r);
		System.out.println("Bed area = " + 3.1415 * r * r + "\n");
	}

}
