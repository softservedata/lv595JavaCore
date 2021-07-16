package com.softserve.edu.less9;

import com.softserve.edu.less8.Hworks.FullName;
import com.softserve.edu.less8.Hworks.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hw3 {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(new FullName("Oksana", "Pavlova"), 28,3 ));
        students.add(new Student(new FullName("Petro", "Ivaniv"), 30,4 ));
        students.add(new Student(new FullName("Natalia", "Marynyna"), 29,4 ));
        students.add(new Student(new FullName("Volodymyr", "Romaniv"), 29,3 ));
        students.add(new Student(new FullName("Viktoria", "Olegova"), 28,5 ));
        System.out.println("Origin student's list : \n"+students);

        students.sort(new Student.NameComparator());
        System.out.println("Name sorted student's list : \n"+students);

        students.sort(new Student.CourseComparator());
        System.out.println("Course sorted student's list : \n"+students);

        System.out.println("Wanted course ?: " );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wantedCourse = Integer.parseInt(br.readLine());
        Student.printStudents(students, wantedCourse);
    }

}
