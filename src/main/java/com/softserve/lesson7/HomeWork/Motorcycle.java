package com.softserve.lesson7.HomeWork;

public class Motorcycle extends GroundVehicle {
private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
