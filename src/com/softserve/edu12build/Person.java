package com.softserve.edu12build;

interface IFirstName {
	ILastName setFirstName(String firstName);
}

interface ILastName {
	ILogin setLastName(String lastName);
}

interface ILogin {
	IEmail setLogin(String login);
}

interface IEmail {
	IAddress setEmail(String email);
}

interface IAddress {
	IBuildPerson setAddress(String address);
}

interface IBuildPerson {
	IPerson build();
}

interface IPerson {
	String getFirstName();
	String getLastName();
	String getLogin();
	String getEmail();
	String getAddress();
}

public class Person implements IFirstName, ILastName, ILogin,
		IEmail, IAddress, IBuildPerson, IPerson {

	private String firstName;
	private String lastName;
	private String login;
	private String email;
	private String address;

//	public Person(String firstName, String lastName, String login, String email, String address) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.login = login;
//		this.email = email;
//		this.address = address;
//	}

	// public Person() {}
	private Person() {
	}

	public static IFirstName get() {
		return new Person();
	}

	// setter

	public ILastName setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ILogin setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public IEmail setLogin(String login) {
		this.login = login;
		return this;
	}

	public IAddress setEmail(String email) {
		this.email = email;
		return this;
	}

	public IBuildPerson setAddress(String address) {
		this.address = address;
		return this;
	}

	public IPerson build() {
		return this;
	}

	// getters

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLogin() {
		return login;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", login=" + login + ", email=" + email
				+ ", address=" + address + "]";
	}

}
