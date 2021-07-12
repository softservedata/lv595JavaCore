package com.softserve.lesson8.shape;

public class Circle implements Shape {
    private int radius;

    @Override
    public double perimetr() {
        return Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
