package lesson7.PayEmployye;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public ContractEmployee(String employeeld, String federalTaxIdmember, int hourlyRate, int numberOfHoursWorked) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee { " +
                "federalTaxIdmember = '" + federalTaxIdmember + '\'' +
                ", hourlyRate = " + hourlyRate +
                ", numberOfHoursWorked =" + numberOfHoursWorked +
                '}';
    }
}
