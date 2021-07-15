package edu.homework08.Person;

public class Student extends Person {
	private int classID;

	public Student(FullName fullName, int age, int classID) {
		super(fullName, age);
		this.classID = classID;
	}

	@Override
	public String activity() {
		return "I study in university";
	}

	@Override
	public String info() {
		return super.info() + ", ClassID: " + classID;
	}

	@Override
	public Student clone() throws CloneNotSupportedException {
		Student studentClone = (Student) super.clone();
		return studentClone;
	}

}
