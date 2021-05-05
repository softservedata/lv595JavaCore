package com.softserve.edu.less2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;


import com.sun.istack.internal.NotNull;



public class Person{
    private String firstName, lastName;
    private int birthYear;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(@NotNull int birthYear) {
        this.birthYear = birthYear;
    }

    Person(){
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

    public void input(BufferReader br){ //} throws Exception{
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }
}
