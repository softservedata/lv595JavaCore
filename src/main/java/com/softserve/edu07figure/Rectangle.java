package com.softserve.edu07figure;

public class Rectangle extends Figure {
    private double length, width;

    public Rectangle(double length, double width) {
        System.out.println("  Constructor Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        System.out.println("review obj Rectangle");
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length 
                + ", width=" + width + "]";
    }
    
}