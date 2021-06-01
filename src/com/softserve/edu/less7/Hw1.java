package com.softserve.edu.less7;

import java.util.ArrayList;
import java.util.Arrays;

public class Hw1 {
    public static void main(String[] args) {
        Employee[] employeers = {new ContractEmployee("contr005","fedTaxNum10056",145, 7),
        new SalariedEmployee("salEm1056","socSecNum4568", 18, 50),
        new ContractEmployee("contr004","fedTaxNum12056",140, 8),
        new SalariedEmployee("salEm1024","socSecNum5568", 19, 45),
        new ContractEmployee("contr012","fedTaxNum10356",150, 7),
        new SalariedEmployee("salEm2056","socSecNum5568", 18, 55),
        };
        System.out.println("Originall staff's list: " + Arrays.toString(employeers));
        Arrays.sort(employeers);
        System.out.println("Sorted by wage staff's list: " + Arrays.toString(employeers));

    }
}

class SalariedEmployee extends Employee{ // implements Payment{
    private double workingDays;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double workingDays, double tax) {
        super(employeeId, tax);
        this.workingDays = workingDays;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(double workingHours) {
        this.workingDays = workingHours;
    }

    @Override
    public String toString() {
/*
        return "SalariedEmployee{ " + getEmployeeId() +
                "socialSecurityNumber " + socialSecurityNumber +
                "; workingDays= " + workingDays +
                " } ";
*/
        return "SalariedEmployee{ " + getEmployeeId() +
                " ; " + socialSecurityNumber +
                "; wDays= " + workingDays +
                "; dTax" + getTax() +
                " }\n";

    }

    @Override
    public double calculatePay() {
        return workingDays * getTax();
    }
}


class ContractEmployee extends Employee{ // implements Payment{
    private double workingHours;
    private String federalTaxIdmember;

    public ContractEmployee(String employeeId, String federalTaxIdmember, double workingHours, double tax) {
        super(employeeId, tax);
        this.workingHours = workingHours;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
/*
        return "SalariedEmployee{ " + getEmployeeId() +
                "federalTaxIdmember " + federalTaxIdmember +
                "; workingHours= " + workingHours +
                " } ";
*/
        return "ContractEmployee{ " + getEmployeeId() +
                 " ; " + federalTaxIdmember +
                "; wHours= " + workingHours +
                " hTax= " + getTax() +
                " }\n";

    }

    @Override
    public double calculatePay() {
        return workingHours * getTax();
    }
}


class Employee implements Payment, Comparable<Employee>{
    private String employeeId;
    private double tax;

    @Override
    public int compareTo(Employee obj) {
/*
        int result = name.compareTo(obj.name);
        return result == 0 ? Integer.compare(this.id, obj.id) : result;
*/
        return -1*Double.compare(this.calculatePay(), obj.calculatePay());
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Employee(String employeeId, double tax) {
        this.employeeId = employeeId;
        this.tax = tax;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                "tax='" + tax + '\'' +
                '}';
    }
}

interface Payment{
    double calculatePay();
}