package com.softserve.lesson7.HomeWork;

public class Helicopter extends FlyingVehicle {
    private int weigth;
    private int maxHeigth;

    public Helicopter(int passengers, int weigth, int maxHeigth) {
        super(passengers);
        this.weigth = weigth;
        this.maxHeigth = maxHeigth;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weigth=" + weigth +
                ", maxHeigth=" + maxHeigth +
                '}';
    }
}
