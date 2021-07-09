package com.softserve.edu11in;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.softserve.edu09sort.Student;

public class AppStud {
	public static void main(String[] args) {
		//
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oksana", 26));
		students.add(new Student("Bogdan", 27));
		students.add(new Student("Orest", 24));
		students.add(new Student("Ira", 23));
		students.add(new Student("Yarko", 21));
		students.add(new Student("Bogdan", 30));
		students.add(new Student("Bogdan", 22));
		//
		//
		System.out.println("Original Arrays: " + students);
		//
		// Collections.sort(students); // Error, Comparable interface not implements
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student st1, Student st2) {
				int byName = st1.getName().compareTo(st2.getName());
				return byName == 0 ? st1.getAge() - st2.getAge() : byName;
			}
		});
		//
		System.out.println("Sorted Arrays: " + students);
		//
	}
}