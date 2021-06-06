package com.softserve.hw4;

public class Product {
	
	private String Name;
	private int Price;
	private int Quantity;
	
	public Product(String name, int price, int quantity) {
		Name = name;
		Price = price;
		Quantity = quantity;
		
	}

	public String getName() {
		return Name;
	}

	public int getPrice() {
		return Price;
	}

	public int getQuantity() {
		return Quantity;
	}
	

}
