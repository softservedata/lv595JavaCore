package com.softserve.edu.homework09.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Paul", 1111));
		students.add(new Student("Shaun", 4444));
		students.add(new Student("Dunk", 3333));
		students.add(new Student("Derek", 2222));
		students.add(new Student("Ross", 1111));
		students.add(new Student("Joe", 4444));
		students.add(new Student("Mark", 1111));
		students.add(new Student("Jam", 3333));
		students.add(new Student("Matt", 4444));
		System.out.println("\n\tPrinting students of course with for loop:\n");
		Student.printStudents(students, 1111);

		System.out.println("\n\tPrinting students of course with iterator:\n");
		Student.printWithIterator(students, 4444);

		System.out.println("\n\tPrinting students List:\n");
		System.out.println(students);

		System.out.println("\n\tSorted by Names\n");
		Collections.sort(students, new Student.ByName());
		System.out.println(students);

		System.out.println("\n\tSorted by Course\n");
		Collections.sort(students, new Student.ByCourse());
		System.out.println(students);

	}

}
