package edu.homework03;

public class StuddentApp {

	public static void main(String[] args) {
		Student student1 = new Student("Nazar", 98);
		Student student2 = new Student();
		student2.setName("Ivan");
		student2.setRating(92);
		Student student3 = new Student("Petro", 78);
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		Student.setAvarage();
		System.out.println("Students avarage = " + Student.avgRating);
		System.out.println("Students total = " + Student.total);
	}

}

class Student {
	private String name;
	private int rating;
	static int total;
	public static int avgRating;
	static int counter;

	public Student() {
	};

	public Student(String name, int rating) {
		this.name = name;
		this.rating = rating;
		total += this.rating;
		counter++;
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
		total += rating;
		counter++;
	}

	static void setAvarage() {

		Student.avgRating = (total / counter);
	}

	public boolean betterStudent(int rating1, int rating2) {
		if (rating1 > rating2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rating=" + rating + "]";
	}
}
