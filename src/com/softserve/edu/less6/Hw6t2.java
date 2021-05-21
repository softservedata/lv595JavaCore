package com.softserve.edu.less6;

public class Hw6t2 {
    public static void main(String[] args) {
       Developer developer1 = new Developer("Taras", 32, 32735.35);
       System.out.println(developer1.report());
        Employee employee1 = new Employee("Taras", 32, 32735.35);
        System.out.println(employee1.report());
    }
}

class Developer extends Employee{
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: Average Java developer, Salary: \u20B4 %.2f.",
                this.getName(), this.getAge(), this.getSalary());
    }
}


class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.",
        name, age, salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}