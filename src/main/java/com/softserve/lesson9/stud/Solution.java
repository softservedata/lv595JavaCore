package com.softserve.lesson9.stud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Student stud = new Student("Igor", 2);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 2));
        students.add(new Student("Inna", 3));
        students.add(new Student("Petro", 2));
        students.add(new Student("Yana", 1));
        students.add(new Student("Vika", 4));
        System.out.println(students);
        System.out.println("Student " + stud.printStudents(students, 1));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sorted name " + students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        System.out.println("Sorted course " + students);
    }
}
