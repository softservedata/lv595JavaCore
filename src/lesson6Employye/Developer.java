package lesson6Employye;

public class Developer extends Employee {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Developer(String name, int age,String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position %s, Salary: \u20B4 %.2f. ", getName(), getAge(),position, getSalary());
    }
}
