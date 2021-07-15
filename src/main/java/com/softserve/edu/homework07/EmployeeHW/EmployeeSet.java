package com.softserve.edu.homework07.EmployeeHW;

import java.util.Comparator;

public class EmployeeSet {
	int tabNumber;
	String name;

	public EmployeeSet(int tabNumber, String name) {
		super();
		this.tabNumber = tabNumber;
		this.name = name;
	}

	static NameComparator nameComparator = new NameComparator();
	static TabComparator tabComparator = new TabComparator();

	public static Comparator getNameComparator() {
		return nameComparator;
	}

	public static Comparator getTabComparator() {
		return tabComparator;
	}

	int getTabNumber() {
		return tabNumber;
	}

	String getName() {
		return name;
	}

	static class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((EmployeeSet) o1).getName().compareTo(((EmployeeSet) o2).getName());
		}
	}

	static class TabComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((EmployeeSet) o1).getTabNumber() - ((EmployeeSet) o2).getTabNumber();
		}

	}

}
