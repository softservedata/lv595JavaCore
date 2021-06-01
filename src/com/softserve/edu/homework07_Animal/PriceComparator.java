package com.softserve.edu.homework07_Animal;

import java.util.Comparator;

public class PriceComparator implements Comparator<Animal> {

	public PriceComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Animal o1, Animal o2) {
		if ((o1.getPrice() - o2.getPrice()) != 0) {
			return o1.getPrice() - o2.getPrice();
		} else if (o1.getName().compareTo(o2.getName()) != 0) {
			return o1.getName().compareTo(o2.getName());
		} else {
			return o1.getAge() - o2.getAge();
		}
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
