package com.softserve.edu.less2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;


public class Student {
    private String name;
    private double rating;
    private static int studentsNumber;
    private static double avrRating;
    private static double totalRating;

    public static void main(String[] args) throws Exception{
        String studentsName;
        double studentsRating;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1st student name?");
        studentsName = br.readLine();
        System.out.println("1st student rating");
        studentsRating = Double.parseDouble(br.readLine());
        Student Student1st = new Student(studentsName, studentsRating);

        System.out.println("Number of students: " + studentsNumber + " , total rating: " + totalRating + " , average rating: " + avrRating);


        Student student2nd = new Student();
        System.out.println("2nd student name?");
        studentsName = br.readLine();
        System.out.println("2nd student rating");
        studentsRating = Double.parseDouble(br.readLine());
        student2nd.setName(studentsName);
        student2nd.setRating(studentsRating);

        System.out.println("Number of students: " + studentsNumber + " , total rating: " + totalRating + " , average rating: " + avrRating);


        System.out.println("3rd student name?");
        studentsName = br.readLine();
        System.out.println("3rd student rating");
        studentsRating = Double.parseDouble(br.readLine());
        Student Student3rd = new Student(studentsName, studentsRating);

        System.out.println("Number of students: " + studentsNumber + " , total rating: " + totalRating + " , average rating: " + avrRating);
/*
        System.out.println("3rd student new rating");
        studentsRating = Double.parseDouble(br.readLine());
        Student3rd.setRating(studentsRating);
        System.out.println("Number of students: " + studentsNumber + " , total rating: " + totalRating + " , average rating: " + avrRating);
*/
    }

    public boolean setName(String arg){
        if (arg.isEmpty()) {
            return false;
        }
        name = arg;
        return true;
    }

    public String getName(){
        return name;
    }

    public boolean setRating(double arg){
        if (arg < 0) {
            return false;
        }
        totalRating -= rating;
        rating = arg;
        totalRating += rating;
        avrRating = totalRating / studentsNumber;
        return true;
    }

    public double getRating(){
        return rating;
    }

    public boolean betterStudent(Student student1, Student student2){
        if (student1.rating >= student2.rating)
            return true;
        return false;
    }

    public String toString(){
        return name + ", " +rating;
    }

    public Student(){
        studentsNumber++;
 //       totalRating
    }


    public Student(String argName, double argRating){
/*        if (argRaing < 0 ) {
            return false;
        }
        totalRating -= rating;
*/        rating = argRating;
        name = argName;
        studentsNumber++;
        totalRating += rating;
        avrRating = totalRating / studentsNumber;
//        return true;
        //       totalRating
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.getRating(), getRating()) == 0 && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRating());
    }
}

/*
public class Main(String[] args){

}
*/