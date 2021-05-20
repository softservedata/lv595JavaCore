package com.softserve.edu.less5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practic2{

    public static void main(String[] args)  throws Exception{
        String wantedDepartment;
        Employee[] employees = {new Employee("Vasylyna", Department.d01, 300),
                new Employee("Oxana", Department.d04, 250),
                new Employee("Igor", Department.d04, 250),
                new Employee("Olga", Department.d03, 350),
                new Employee("Vasyl", Department.d02, 300)};
        Employee employeeTmp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Array is: " + Arrays.toString(numbers));
        System.out.println(Arrays.toString(employees));
        System.out.print("Wanted department [dXX]? ");
        wantedDepartment = br.readLine();
        Department wantedDep = Department.valueOf(wantedDepartment);
        System.out.println("Wanted dep : " + wantedDep);
//        splitPosithion = Integer.parseInt(br.readLine());
        for (Employee empl : employees){
//            System.out.println(empl.getDepartmentNumber());

            if (wantedDep.equals(empl.getDepartmentNumber()))
                System.out.println(empl);
        }

        for (int i = 0; i < employees.length; i++)
            for (int j = i + 1; j < employees.length; j++)
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    employeeTmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = employeeTmp;
                }
       System.out.println("Empoless ordered in descending : ");
       System.out.println(Arrays.toString(employees));

    }
}

class Employee{
    private String name;
    private Department departmentNumber;
    private double salary;


    public Employee(String name, Department departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                "}\n";
    }

    public Department getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }
}

enum Department{
    d01("ITR"),
    d02("Managment"),
    d03("CutDepartment"),
    d04("SewShop1"),
    d05("SewShop2");
    protected String depName;

    Department(String depName) {
        this.depName = depName;
    }

//    @Override
    public String toString() {
        if (this == Department.d01)
            return "d01{" + depName + '}';
        if (this == Department.d02)
            return "d02{" + depName + '}';
        if (this == Department.d03)
            return "d03{" + depName +  '}';
        if (this == Department.d04)
            return "d04{" + depName +  '}';
        if (this == Department.d05)
            return "d05{" + depName +  '}';

        return "Unknown";
/*       switch (this) {
           case Department.d01:
               return "d01{" + depName + '\'' +
                       '}';
       }
*/
        /*
        return "department{" +
                "depName='" +  + depName + '\'' +
                '}';
*/
    }
}