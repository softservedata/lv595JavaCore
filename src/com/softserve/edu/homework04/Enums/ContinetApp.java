package com.softserve.edu.homework04.Enums;

public class ContinetApp {

	public static void main(String[] args) {
		
		ContinentEnum country1 = ContinentEnum.Asia;
		System.out.println(country1.toString());
		System.out.println(country1.getContinet("China"));

		System.out.println();

		ContinentEnum country2 = ContinentEnum.valueOf("Europe");
		System.out.println(country2);
		System.out.println(country2.getContinet("Ukraine"));
	}

}
