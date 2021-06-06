package com.softserve.hw3;

public class Student {
	private String Name;
	private int Rating;

	static double count;
	static double ttl;
	static double avgRating;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
		++count;
		ttl = ttl + rating;
		avgRating = ttl / count;
	}

	public Student() {
	}

	public Student(String name, int rating) {
		Name = name;
		Rating = rating;
		++count;
		ttl = ttl + rating;
		avgRating = ttl / count;
	}

	public boolean betterStudent(int student1, int student2) {
		if (student1 > student2) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Student [Name = " + Name + ", Rating = " + Rating + "]" + "\n Average rating: "  + avgRating;
	}

}
