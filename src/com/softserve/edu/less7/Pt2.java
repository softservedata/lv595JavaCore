package com.softserve.edu.less7;

public class Pt2 {
    public static void main(String[] args) {
        Person[] persons = {new Student("Ivan"),
                new Teacher("Roman Petrovych"),
                new Cleaner("Igor Volodymyrovy4"),
                new Teacher("Anna Pavlivna"),
                new Student("Oxana"),
                new Student("Vasyl"),
                new Student("Natalia")};

        for (Person person : persons) {
            person.print();
            if (person instanceof Staff)
            ((Staff)person).salary();
       }

    }
}

    class Student extends Person {
        private final String TYPE_PERSON = "Student";

        public Student(String name) {
            super(name);
            System.out.println(TYPE_PERSON + " : " + this.getName());
        }

        public void print() {
            System.out.println("I'm a Student");
        }
    }
    abstract class Staff extends Person {
        Staff(String name){
          super(name);
        }

        public void print() {
            System.out.println("I am a staff");
        }
        abstract void salary();
    }

    class Teacher extends Staff {
        private final String TYPE_PERSON = "Teacher";

        public Teacher(String name) {
            super(name);
            System.out.println(TYPE_PERSON + " : " + this.getName());
        }

        public void salary(){
            System.out.println("teache's salary");
        }

        @Override
        public void print() {
            System.out.print("I am a Theacher - ");
            super.print();
        }
    }

    class Cleaner extends Staff {
        private final String TYPE_PERSON = "Cleaner";

        public Cleaner(String name) {
            super(name);
            System.out.println(TYPE_PERSON + " : "+ this.getName());
        }


        public void salary(){
            System.out.println("cleaner's salary");
        }

        @Override
        public void print() {
            System.out.print("I am a Cleaner - ");
            super.print();
        }
    }

    abstract class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        abstract void print();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

//}