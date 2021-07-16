package com.softserve.edu.less8.Hworks;

import java.util.Objects;

public class FullName { //implements Cloneable{
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public FullName() {
        firstName = "";
        lastName = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FullName)) return false;
        FullName fullName = (FullName) o;
        return getFirstName().equals(fullName.getFirstName()) && getLastName().equals(fullName.getLastName());
    }
    /*
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    */
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}