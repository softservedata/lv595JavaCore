package edu.homework08.Person;

public class PersonMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student student1 = new Student(new FullName("Nazar", "Ivankiv"), 26, 1345);
		Student student2 = new Student(new FullName("Ivan", "Dudan"), 27, 1549);
		Student student3 = student1.clone();

		System.out.println(student1.activity());
		System.out.println(student1.info());

		System.out.println(student2.activity());
		System.out.println(student2.info());

		System.out.println(student3.activity());
		System.out.println(student3.info());

		FullName newFullName = new FullName();
		newFullName.setFirstName("Pierre");
		newFullName.setLastName("Pert");
		student1.setFullName(newFullName);
		student1.setAge(31);

		System.out.println(student1.activity());
		System.out.println(student1.info());

		System.out.println(student2.activity());
		System.out.println(student2.info());

		System.out.println(student3.activity());
		System.out.println(student3.info());

	}
}
