package com.softserve.lesson9.stud;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String printStudents(List<Student> students, int course) {
        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
            Student st = iterator.next();
            if (st.getCourse() == course)
                return st.getName();
        }
        return " Course ";
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getCourse() {
        return course;
    }

    public Student setCourse(int course) {
        this.course = course;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
