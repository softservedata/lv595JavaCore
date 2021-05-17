package lesson5;

import java.util.Scanner;

public class Employee {
    private String name;
    private int depNum;
    private double salary;

    private void scn() {
        Scanner sc = new Scanner(System.in);
        depNum = sc.nextInt();
    }

    public Employee(String name, int depNum, double salary) {
        this.name = name;
        this.depNum = depNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepNum() {
        return depNum;
    }

    public void setDepNum(int depNum) {
        this.depNum = depNum;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", depNum=" + depNum +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee max = new Employee("Max", 1, 2022.22);
        System.out.println("Scan max ");
        max.scn();
        System.out.println(max);
    }
}
