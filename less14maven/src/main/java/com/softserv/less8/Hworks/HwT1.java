package com.softserve.edu.less8.Hworks;

//import com.softserve.edu.less2.Person;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Comparator;


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

//----------------------------------------------------------------
abstract class Person{ // implements Cloneable{
    private FullName fullName;// = new FullName();
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public FullName getFullName() {
        return fullName;
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
/*
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tempPerson = (Person) super.clone();
        tempPerson.fullName = (FullName) tempPerson.fullName.clone();
        return tempPerson;

    }*/
}



//----------------------------------------------------------------
