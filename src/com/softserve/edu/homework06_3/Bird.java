package com.softserve.edu.homework06_3;

public abstract class Bird {
	
	protected String name;
	protected String feathers;
	protected boolean layEggs;
	
	protected abstract void fly();

	String getFeathers() {
		return feathers;
	}

	void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	
	public abstract String getClassName();

//	String getName() {
//		return name;
//	}
//
//	void setName(String name) {
//		this.name = name;
//	}
//
//	boolean isLayEggs() {
//		return layEggs;
//	}
//
//	void setLayEggs(boolean layEggs) {
//		this.layEggs = layEggs;
//	}
//	
	
}
