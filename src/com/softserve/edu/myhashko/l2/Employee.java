package com.softserve.edu.myhashko.l2;

public class Employee {

    private String name, surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        System.out.println("getting name");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
