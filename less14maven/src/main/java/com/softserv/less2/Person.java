package com.softserve.edu.less2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;


//import com.sun.istack.internal.NotNull;



public class Person{
    private String firstName, lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }
//@NotNull
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
//@NotNull
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
//@NotNull
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    Person(){
        firstName = "";
        lastName = "";
    }

    Person (String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    public int getAge() {
//        GregorianCalendar gcalendar = new GregorianCalendar();
//        int year = Calendar.YEAR;
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR) - birthYear;
    }

    public void input() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input FirstName: ");
        firstName  = br.readLine();
        System.out.println("Input LastName: ");
        lastName  = br.readLine();
        System.out.println("Input birthYear: ");
        birthYear  = Integer.parseInt(br.readLine());
    }

    public void output(){
        System.out.println("A person's data - " + firstName + " " + lastName + " " + birthYear);
    }

    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        System.out.println("the age is " + person1.getAge());
        person2.input();
        System.out.println("the age is " + person2.getAge());
        person3.input();
        System.out.println("the age is " + person3.getAge());
        person4.input();
        System.out.println("the age is " + person4.getAge());
        person5.input();
        System.out.println("the age is " + person5.getAge());

//        System.out.println("the age is ");
    }
}
