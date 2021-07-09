package com.softserve.edu07figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        System.out.println("  Constructor Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        System.out.println("review obj Circle");
        return (3.14 * (radius * 2));
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    
}
