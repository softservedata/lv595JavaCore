package com.softserve.edu.homework07.Animal;

import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {

	public AgeComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Animal o1, Animal o2) {
		if ((o1.getAge() - o2.getAge()) != 0) {
			return o1.getAge() - o2.getAge();
		} else if (o1.getName().compareTo(o2.getName()) != 0) {
			return o1.getName().compareTo(o2.getName());
		} else {
			return -(o1.getPrice() - o2.getPrice());
		}
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
