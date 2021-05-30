package lesson7.PayEmployye;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("Emp1", "udjpshf", 69.5, 180),
                new SalariedEmployee("Emp2", 35725.58, "dusnsbd752"),
                new SalariedEmployee("Emp3", 28462.93, "odnddj722"),
                new ContractEmployee("Emp4", "jdsd9363", 75.74, 156)
        };
        for (Employee count : employees)
            System.out.println(count + " Salary is  " + count.calculatePay());
        Arrays.sort(employees);
        System.out.println("Sorted array : ");
        for (Employee count : employees)
            System.out.println(count.compareTo(employees[1]) + " Salary is  " + count.calculatePay());
    }
}
