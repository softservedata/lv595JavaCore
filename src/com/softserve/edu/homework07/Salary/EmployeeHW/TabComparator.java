package com.softserve.edu.homework07_Employee;
import java.util.Comparator;
public class TabComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.tabNumber - o2.tabNumber;
    }
}
