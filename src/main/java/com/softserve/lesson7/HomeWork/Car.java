package com.softserve.lesson7.HomeWork;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
