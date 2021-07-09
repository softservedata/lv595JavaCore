package com.softserve.edu.homework11.ExceptionsPractical;

public enum Color {
	Red ("Red"), White ("White"), Blue ("Blue");
	
	private String color;

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	

}
