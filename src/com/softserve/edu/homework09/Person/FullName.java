package com.softserve.edu.homework09.Person;

public class FullName implements Cloneable{
	
	private String firstName;
	private String lastName;
	
	public FullName() {
		firstName="";
		lastName= "";
		
	}
	
	public FullName(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Object clone () throws CloneNotSupportedException {
		FullName fullName = (FullName) super.clone();
		return fullName ;
	}

}
