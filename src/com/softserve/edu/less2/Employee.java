package com.softserve.edu.less2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Employee {

    private String name;
    private double rate, hours;
    private static double totalSum;

    public boolean setName (String arg) {
        if (arg.isEmpty()) return false;
        name = arg;
        return true;
    }

    public String getName() {
        return name;
    }

    public boolean setHours(double hours) {
        if (hours < 0) {
            return false;
        } else {
            this.hours = hours;
            return true;
        }
    }

    public double getHours() {
        return hours;
    }

    public boolean setRate(double rate) {
        if (rate < 0) return false;
        this.rate = rate;
        return true;
    }

    public double getRate() {
        return rate;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    Employee(){
    }

    Employee(String name, double rate){
        this.name = name;
        this.rate = rate;
    }

    Employee(String name, double rate, double hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    public String toString(){
        return "name: " + name + ", rate: " + rate + " , hours: " + hours;
    }

    public void changeRate(int rate){
        this.rate = rate;
    }

    public double getBonuses(){
        return 0.1 * getSalary();
    }

   public static void main(String[] args) throws Exception{
//jlkjlk
        String currentEmployeeName;
        double currentEmployeeRate, currentEmployeeHours;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("1st employee name?");
            currentEmployeeName = br.readLine();
        } while(currentEmployeeName.isEmpty());

       do {
           System.out.println("1st employee rate?");
           currentEmployeeRate = Double.parseDouble(br.readLine());
       } while(currentEmployeeRate < 0);

       do {
           System.out.println("1st employee hours?");
           currentEmployeeHours = Double.parseDouble(br.readLine());
       } while(currentEmployeeHours < 0);

       Employee employee1st = new Employee(currentEmployeeName, currentEmployeeRate, currentEmployeeHours);
       Employee employee2nd = new Employee();

       do {
           System.out.println("2nd employee name?");
           currentEmployeeName = br.readLine();
       } while(!employee2nd.setName(currentEmployeeName));

       do {
           System.out.println("2nd employee rate?");
           currentEmployeeRate = Double.parseDouble(br.readLine());
       } while(!employee2nd.setRate(currentEmployeeRate));

       do {
           System.out.println("2nd employee hours?");
           currentEmployeeHours = Double.parseDouble(br.readLine());
       } while(!employee2nd.setHours(currentEmployeeHours));


       do {
           System.out.println("3rd employee name?");
           currentEmployeeName = br.readLine();
           System.out.println("3rd employee rate?");
           currentEmployeeRate = Double.parseDouble(br.readLine());
       } while(currentEmployeeName.isEmpty() || currentEmployeeRate < 0);

       Employee employee3rd = new Employee(currentEmployeeName, currentEmployeeRate);

       do {
           System.out.println("3rd employee hours?");
           currentEmployeeHours = Double.parseDouble(br.readLine());
       } while(!employee3rd.setHours(currentEmployeeHours));

       System.out.println("----------------------");
       System.out.println("1st employee - " + employee1st.toString() + ", salary " + employee1st.getSalary() + ", bonuses - " + employee1st.getBonuses());
       System.out.println("2nd employee - " + employee2nd.toString() + ", salary " + employee2nd.getSalary() + ", bonuses - " + employee2nd.getBonuses());
       System.out.println("3rd employee - " + employee3rd.toString() + ", salary " + employee3rd.getSalary() + ", bonuses - " + employee3rd.getBonuses());

       System.out.println("Total Salary - " + (employee1st.getSalary() + employee2nd.getSalary() + employee3rd.getSalary()));

   }



}

