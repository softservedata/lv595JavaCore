package com.softserve.lesson7.PayEmployye;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("Emp1", "udjpshf", 69, 180),
                new SalariedEmployee("Emp2", 35725, "dusnsbd752"),
                new SalariedEmployee("Emp3", 28462, "odnddj722"),
                new ContractEmployee("Emp4", "jdsd9363", 75, 156)
        };
        for (Employee count : employees)
            System.out.println(count + " Salary is  " + count.calculatePay());
        Arrays.sort(employees);
        System.out.println("Sorted array : ");
        for (Employee count : employees)
            System.out.println(count + " Salary is  " + count.calculatePay());
    }
}
