package com.softserve.edu11box;

//import java.io.Serializable;

public class BoxGen<T> { // BoxGen<T extends Serializable> {
	private T obj;

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

//    public static T todo() { // Error
//    }
}
