package com.softserve.edu.less7;
/*
import java.util.*;

public class PractSorting {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(52645, "Oksana");
        students[1] = new Student(98765, "Bogdan");
        students[2] = new Student(1354, "Orest");
        students[3] = new Student(68765, "Bogdan");
        students[4] = new Student(32645, "Oksana");
/*
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(52645, "Oksana"));
        students.add(new Student(98765, "Bogdan"));
        students.add(new Student(1354, "Orest"));
        students.add(new Student(68765, "Bogdan"));
        students.add(new Student(32645, "Oksana"));
        Collections.sort(students);

        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }


        List<Pupil> pupilsList = new ArrayList<>();
        pupilsList.add(new Pupil(152, "Mari4ka"));
        pupilsList.add(new Pupil(113, "Igor"));
        pupilsList.add(new Pupil(213, "Roman"));
        pupilsList.add(new Pupil(103, "Roman"));
        pupilsList.add(new Pupil(182, "Igor"));
        pupilsList.add(new Pupil(118, "Mari4ka"));
        pupilsList.add(new Pupil(145, "Ivanka"));

        System.out.println("Original list: \n" + pupilsList);

        pupilsList.sort(new Pupil.IdComparator());//pupilsList);
        System.out.println("Sorted list by name: \n" + pupilsList);

    }
}



class Pupil  implements Comparable<Pupil> {
     int id;
     String name;

    public Pupil(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pupil() {
        id = 0;
        name = "";
    }


    @Override
    public int compareTo(Pupil obj) {
     int result = name.compareTo(obj.name);
     return result == 0 ? Integer.compare(this.id, obj.id) : result;

        /*
        if (name.compareTo(obj.name) != 0)
            return name.compareTo(obj.name);
        return Integer.compare(this.id, obj.id);

    }


        @Override
    public String toString() {
        return "\n\tPupil{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


static    class NameComparator implements Comparator<Pupil> {
        @Override
        public int compare(Pupil o1, Pupil o2) {
            return o1.name.compareTo(o2.name);
        }
    }

 static   class IdComparator implements Comparator<Pupil>{
        @Override
        public int compare(Pupil o1, Pupil o2) {
            return o1.id - o2.id;
        }
    }

}

 class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
      if (name.compareTo(obj.name) != 0)
        return name.compareTo(obj.name);
      return Integer.compare(this.id, obj.id);
    }
}
*/