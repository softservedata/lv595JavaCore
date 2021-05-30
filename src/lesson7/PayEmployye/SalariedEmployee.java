package lesson7.PayEmployye;

public class SalariedEmployee extends Employee implements Payment {
    private double salar;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeld, double salar, String socialSecurityNumber) {
        super(employeeld);
        this.salar = salar;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public double calculatePay() {
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
