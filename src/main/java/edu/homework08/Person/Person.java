package edu.homework08.Person;

public abstract class Person implements Cloneable {
	private FullName fullName;
	private int age;

	public Person() {
	}

	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", age=" + age + ", FullName toString()=" + super.toString() + "]";
	}

	public Person clone() throws CloneNotSupportedException {
		Person personClone = (Person) super.clone();
		personClone.fullName = (FullName) this.fullName.clone();
		return personClone;
	}

	public String info() {
		return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;

	}

	public abstract String activity();

}
