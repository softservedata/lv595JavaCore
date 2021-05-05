package com.softserve.edu03;

class Person {}

public class Student { // extends Object
    private String firstName; // = null
    private String lastName; // = null
    private int age; // = 0

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }
    
    public Student(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        // TODO
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName
                + ", lastName=" + lastName
                + ", age=" + age
                + "]";
    }

}
