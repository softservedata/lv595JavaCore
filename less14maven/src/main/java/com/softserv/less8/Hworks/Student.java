package com.softserve.edu.less8.Hworks;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


    public class Student extends Person implements Comparable{
        private int course;

        @Override
        public String toString() {
            return "\tStudent{" +
                    "course=" + course +
                    "} " + super.toString()
                    + "\n";
        }

        public int getCourse() {
            return course;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof com.softserve.edu.less8.Hworks.Student)) return false;
            com.softserve.edu.less8.Hworks.Student student = (com.softserve.edu.less8.Hworks.Student) o;
            if (getCourse() != student.getCourse())
                return false;
            return getFullName().equals(student.getFullName());
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = result * prime + 1;
            result = result * prime + Objects.hash(getCourse());
            result = result * prime + ((getFullName() == null) ? 0 : getFullName().hashCode());
            return result; //Objects.hash(getCourse());
        }

        public void setCourse(int course) {
            this.course = course;
        }


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

        @Override
        public int compareTo(Object obj) {
            com.softserve.edu.less8.Hworks.Student student = (com.softserve.edu.less8.Hworks.Student) obj;
            return course - student.getCourse();
/*            return false;
        return getFullName().equals(student.getFullName());        return 0;
*/    }
        //-------------------------------
    static     public class NameComparator implements Comparator<com.softserve.edu.less8.Hworks.Student> {
            @Override
            public int compare(com.softserve.edu.less8.Hworks.Student o1, com.softserve.edu.less8.Hworks.Student o2) {
                if (o1.getFullName().getFirstName().equals(o2.getFullName().getFirstName()))
                    return o1.getFullName().getLastName().compareTo(o2.getFullName().getLastName());
                return o1.getFullName().getFirstName().compareTo(o2.getFullName().getFirstName());

            }
        }
        //-------------------------------------------------------------
    static     public class CourseComparator implements Comparator<com.softserve.edu.less8.Hworks.Student>{
            @Override
            public int compare(com.softserve.edu.less8.Hworks.Student o1, com.softserve.edu.less8.Hworks.Student o2) {
                return o1.course - o2.course;
            }
        }
        static public void printStudents (List students, Integer course){
            Iterator<com.softserve.edu.less8.Hworks.Student> iteratorStudents = students.iterator();
            com.softserve.edu.less8.Hworks.Student current;
            System.out.println("Student's list for course " + course + "is :");
            while (iteratorStudents.hasNext()){
                current = iteratorStudents.next();
                if (current.getCourse() == course )
                    System.out.print(current);

            }
        }
    }



