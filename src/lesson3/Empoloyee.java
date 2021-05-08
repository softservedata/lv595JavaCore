package lesson3;

public class Empoloyee {
    private String name;
    private double rate;
    private int hours;
    public static double totalSum;
    public double changeR;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getotalSum() {
        return totalSum;
    }

    public static void settotalSum(double totalSum) {
        totalSum = totalSum;
    }

    public Empoloyee(String name) {
        this.name = name;
    }

    public Empoloyee(double rate) {
        this.rate = rate;
    }

    public Empoloyee(int hours) {
        this.hours = hours;
    }

    public Empoloyee(double rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public Empoloyee(String name, int hours, double rate) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public double getSalary(double rate, int hours) {

        return rate * hours;
    }

    public double total(int hours, double rate) {
        totalSum = hours * rate;
        return totalSum;
    }

    public double changeRate(double rate) {
        return rate * changeR;
    }

    public double getBonus(double totalSum) {
        return totalSum * 0.1;
    }

    public void outs() {
        System.out.println("Працівник " + name + " пропрацював " + hours + " годин зі ставкою " + rate + " заробив " + total(this.hours, this.rate) + " + бонус " + getBonus(this.totalSum));
    }

    @Override
    public String toString() {
        return "Empoloyee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {
        Empoloyee developer = new Empoloyee("Oleg", 170, 634.45);
        Empoloyee teamLead = new Empoloyee("Borys", 190, 583.65);
        Empoloyee pm = new Empoloyee("Marta", 183, 740.54);
        developer.outs();
        teamLead.outs();
        pm.outs();
    }

}
