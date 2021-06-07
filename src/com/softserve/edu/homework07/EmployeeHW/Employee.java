package com.softserve.edu.homework07.EmployeeHW;

import java.util.Comparator;

public class Employee {
    double tabNumber;
    String name;
    public Employee(String name, double tabNumber) {
        this.name = name;
        this.tabNumber = tabNumber;
    }
    @Override
    public String toString() {
        return "Employee [tabNumber=" + tabNumber + ", name=" + name + "]";
    }
    
    public static class NameComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    
    public static class TabComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o1.tabNumber, o2.tabNumber);
        }
    }
}