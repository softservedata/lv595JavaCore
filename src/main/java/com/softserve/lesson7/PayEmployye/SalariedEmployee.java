package com.softserve.lesson7.PayEmployye;

public class SalariedEmployee extends Employee implements Payment {
    private int salar;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeld, int salar, String socialSecurityNumber) {
        super(employeeld);
        this.salar = salar;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public int calculatePay() {
        return salar;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salar=" + salar +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
