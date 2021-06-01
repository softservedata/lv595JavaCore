package com.softserve.edu03;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public int getSalary() {
        return this.rate * this.hours;
    }

    @Override
    public String toString() {
        return "Employee name = " + name
                + " rate = " + rate
                + " hours = " + hours;
    }

    public int changeRate(int rate) {
        this.rate = rate;
        return this.rate * this.hours;

    }
    public float getBonuses() {
        return (float) ((float) this.getSalary() * 0.1);

    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Vova", 50, 48);
        Employee employee2 = new Employee("Ira", 45, 50);
        Employee employee3 = new Employee("Ivan", 60, 30);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        setTotalSum(employee1.getSalary() + employee2.getSalary() + employee3.getSalary());

        System.out.println("Total salary =" + getTotalSum());
    }
}



