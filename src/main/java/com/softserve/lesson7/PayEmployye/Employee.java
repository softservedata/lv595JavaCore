package com.softserve.lesson7.PayEmployye;

import java.util.Objects;

public class Employee implements Payment, Comparable<Employee> {

    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "employeeld = '" + employeeld + '\'' +
                '}';
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeld.equals(employee.employeeld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeld);
    }

    @Override
    public int compareTo(Employee o) {

        return calculatePay() - o.calculatePay();
    }
}
