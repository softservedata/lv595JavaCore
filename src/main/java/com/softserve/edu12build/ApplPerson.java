package com.softserve.edu12build;

public class ApplPerson {
	public static void main(String[] args) {
		//Person p = new Person("fi", "ln", "lo", "em", "adr");
		//
//		Person p = new Person();
//		p.setFirstName("firstName");
//		//p.setLastName("lastName");
//		p.setLogin("login");
//		p.setEmail("email");
//		p.setAddress("address");
//		System.out.println(p);
//		p.getLastName().length(); // NullPointerException
		//
		//Person p = new Person()
//		Person p = Person.get()
//				.setEmail("email")
//				.setFirstName("firstName");
		//
		IPerson p = Person.get()
				.setFirstName("fN")
				.setLastName("ln")
				.setLogin2("login")
				//.setLogin("log")
				.setEmail("em")
				.setAddress("address")
				.build();
		//System.out.println("FirsName = " + p.setFirstName("sdsdf")); // Error
		System.out.println("FirsName = " + p.getFirstName());
		System.out.println("FirsName = " + p);
	}
}
