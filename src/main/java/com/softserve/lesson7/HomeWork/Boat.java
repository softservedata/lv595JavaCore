package com.softserve.lesson7.HomeWork;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {

    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                '}';
    }
}
