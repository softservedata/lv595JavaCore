package com.softserve.edu.homework04_2;

public enum Breed{
	Labrador("Labrador"), Retriever("Retriever"), Bulldog("Bulldog"), Shepherd("Shepherd");

	private String breed;

	private Breed(String breed) {
		this.breed=breed;
	}

	public String setBreed() {
		return breed;
	}
	public String toString() {
		return breed;
	}
}