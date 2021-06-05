package com.softserve.edu.less8.Hworks;

//import com.softserve.edu.less2.Person;

import java.util.Objects;

public class HwT1 {


    public static void main(String[] args) {
         Student student1 = new Student(new FullName("Oksana", "Petrivska"), 29, 2);
        Student student2 = new Student(new FullName("Vasyl", "Marynyn"), 32, 3);
        System.out.println("Student1 information:\n\t"+ student1.info() +
                "\n\tStudent1 activity: " + student1.activity());
        System.out.println("Student2 information:\n\t"+ student2.info() +
                "\n\tStudent2 activity: " + student2.activity());

    }
}


//----------------------------------------------------------------
class Student extends Person{
   private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info(){
        return super.info() + " has " + course + "courses.";
    }

    public String activity(){
        return "I study at university";
    }
}


//----------------------------------------------------------------
abstract class Person implements Cloneable{
    public FullName fullName;// = new FullName();
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = new FullName(fullName.getFirstName(), fullName.getLastName());
        this.age = age;
    }

    public String info() {
        return "First name: <" + fullName.getFirstName() +
                ">, Last name: <" + fullName.getLastName() +
                ">, Age: <" + age + ">";
    }

    public abstract String activity();

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tempPerson = (Person) super.clone();
        tempPerson.fullName = (FullName) tempPerson.fullName.clone();
        return tempPerson;

    }
}



//----------------------------------------------------------------
class FullName {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}