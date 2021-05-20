package lesson5;

import java.util.Scanner;

public class Employee {
    private String name;
    private int depNum;
    private double salary;


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
        Scanner sc = new Scanner(System.in);
        Employee max = new Employee("Max", 1, 2022.22);
        Employee kris = new Employee("Kris", 2, 1632.37);
        Employee mart = new Employee("Marta", 1, 3253.58);
        Employee nat = new Employee("Natalie", 3, 5362.81);
        Employee den = new Employee("Denys", 1, 2505.74);
        Employee[] emp = new Employee[5];
        emp[0] = max;
        emp[1] = kris;
        emp[2] = mart;
        emp[3] = nat;
        emp[4] = den;

        double tmp;
        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].salary < emp[j].salary) {
                    tmp = emp[i].salary;
                    emp[i].salary = emp[j].salary;
                    emp[j].salary = tmp;
                }
            }
        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }

        System.out.println("Enter the department number ");
        int ss = sc.nextInt();
        switch (ss) {
            case (1):
                System.out.println(max + " " + mart + " " + den);
                break;
            case (2):
                System.out.println(kris);
                break;
            case (3):
                System.out.println(nat);
                break;
        }

    }
}
