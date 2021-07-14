package com.softserve.edu.homework07.EmployeeHW;

import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		Set<EmployeeSet> set = new TreeSet(EmployeeSet.getNameComparator());
		set.add(new EmployeeSet(15, "Vasya"));
		set.add(new EmployeeSet(2, "Anna"));
		set.add(new EmployeeSet(40, "Alina"));
		System.out.println(set);

		Set<EmployeeSet> set1 = new TreeSet(EmployeeSet.getTabComparator());
		set1.addAll(set);
		System.out.println(set1);

	}

}
