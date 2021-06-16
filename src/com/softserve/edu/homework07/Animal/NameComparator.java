package com.softserve.edu.homework07.Animal;

import java.util.Comparator;

public class NameComparator implements Comparator<Animal> {

	public NameComparator() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Animal o1, Animal o2) {
		if (o1.getName().compareTo(o2.getName()) != 0) {
			return o1.getName().compareTo(o2.getName());
		} else if ((o1.getAge() - o2.getAge()) != 0) {
			return o1.getAge() - o2.getAge();
		} else {
			return o1.getPrice() - o2.getPrice();
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
