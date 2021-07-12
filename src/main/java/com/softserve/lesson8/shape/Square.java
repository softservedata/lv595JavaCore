package com.softserve.lesson8.shape;

public class Square implements Shape {
    private double a, b;

    @Override
    public double perimetr() {
        return (2 * a) + (2 * b);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
