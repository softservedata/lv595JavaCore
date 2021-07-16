package com.softserve.edu.less9;

import com.softserve.edu.less2.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
    List<Student> studentsList = new LinkedList<>();
    studentsList.add(new Student("Ivan",95));
        studentsList.add(new Student("Ivan",95));
        studentsList.set(1, new Student("Ivan",95));
        studentsList.add(new Student("Ivan",95));
        studentsList.set(2, new Student("Ivan",95));
        Student studentWanted = new Student("Ivan",95);
        if (studentsList.remove(studentWanted))
            System.out.println("Wanted!!");
        else {
            System.out.print("Missed!!!");
            System.out.println(studentWanted.equals(studentsList.get(1)));
        }
//        System.out.println(studentsList);
        int count =0;
        for (Student studentTemp : studentsList)
            System.out.println(count++ + " student is " + studentTemp);

    }
}
