package com.softserve.edu.less6;

public class Practic1 {

    public static void main(String[] args) {

    Car[] cars = {
            new Sedan("MB c250", 195, 2018, 5),
            new Sedan("Skoda SuperB", 190, 2015, 5),
            new Truck("Volvo T40", 155, 2008, 2500)
    };
    for (Car car : cars)
        System.out.println(car);
   }
}

class Sedan extends Car{
    protected int numberOfSets;

    Sedan(String model, double maxSpeed, int yearOfManufacture, int numberOfSets) {
        this.numberOfSets = numberOfSets;
        super.model = model;
        super.maxSpeed = maxSpeed;
        super.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Sedan{" + super.toString() +
                "numberOfSets=" + numberOfSets +
                '}';
    }
}

class Truck extends Car{
    private double maxWeigth;

    Truck(String model, double maxSpeed, int yearOfManufacture, double maxWeigth) {
        this.maxWeigth = maxWeigth;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                ", maxWeigth=" + maxWeigth +
                '}';
    }
}

abstract class Car {
    protected String model;
    protected double maxSpeed;
    protected int yearOfManufacture;
/*
    Car(String model, double maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;


    }
*/

    public void run(){};
    public void stop(){};

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}