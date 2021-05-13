package com.softserve.edu.homework04;

public class IntChecker {
	private int int1;
	private int int2;
	private int int3;
	private int max;
	private int min;
	Reader read = new Reader();
	
	public IntChecker() {}

	public void setInt1() {
		
		this.int1 = read.scanInt();
	}
	
	public void setInt2() {
		this.int2 = read.scanInt();
	}

	public void setInt3() {
		this.int3 = read.scanInt();
	}
	
	public int getMax () {
		max= this.int1;
		if (this.int2>max) {
			max=this.int2;
		}
		if (this.int3>max) {
			max=this.int3;
		}
		return max;
	}
	
	public int getMin () {
		min= this.int1;
		if (this.int2<min) {
			min=this.int2;
		}
		if (this.int3<min) {
			min=this.int3;
		}
		
		return min;
	}
	
	public void printMax() {
		System.out.println("Maximum integer value  = " + getMax());	
		}
	public void printMin() {
		System.out.println("Minimum integer value  = " + getMin());	
		}
}
