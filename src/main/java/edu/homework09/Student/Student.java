package edu.homework09.Student;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student implements Comparable<Student> {
	private String name;
	private int course;

//----------------------------------------------------------------------------------------------------------------------------
	public static void printStudents(List<Student> students, Integer cource) {
		for (Student current : students) {
			if (current.getCourse() == cource) {
				System.out.println(current);
			}
		}
	}

	public static void printWithIterator(List<Student> students, Integer cource) {
		ListIterator<Student> iter = students.listIterator();
		while (iter.hasNext()) {
			Student current = iter.next();
			if (current.getCourse() == cource) {
				System.out.println(current);
			}
		}
	}

	public static class ByName implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName()) == 0 ? Integer.compare(o1.getCourse(), o2.getCourse())
					: o1.getName().compareTo(o2.getName());
		}
	}

	public static class ByCourse implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return Integer.compare(o1.getCourse(), o2.getCourse()) == 0 ? o1.getName().compareTo(o2.getName())
					: Integer.compare(o1.getCourse(), o2.getCourse());
		}
	}

//------------------------------------------------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [ name: " + getName() + ", course: " + getCourse() + " ]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}

}
