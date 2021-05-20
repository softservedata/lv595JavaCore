package com.softserve.edu.less6;

public class Practic2 {
    public static void main(String[] args) {
    Line[] lines = {new Line(new Point(100,100), new Point(100, 150)),
        new ColorLine(new Point(100,100), new Point(150,150), "red"),
        new Line(new Point(100, 100), new Point(150, 100))};

    for (Line line : lines)
       line.print();
//         System.out.println(line);
    }
}

class ColorLine extends Line{
    protected String color;

    public ColorLine(Point point1st, Point point2nd, String color) {
        super(point1st, point2nd);
        this.color = color;
    }

    public void print(){
        System.out.println("ColorLine.print " +
        toString());
    }

    @Override
    public String toString() {
        return  "{color='" + color + '\'' +
                ", point1st=" + point1st +
                ", point2nd=" + point2nd +
                '}';
    }
}

class Line{
    Point point1st;
    Point point2nd;

    public Line(Point point1st, Point point2nd) {
        this.point1st = point1st;
        this.point2nd = point2nd;
    }

    public void print(){
        System.out.println("Line.print " + toString());
    }

    @Override
    public String toString() {
        return  "{point1st=" + point1st +
                ", point2nd=" + point2nd +
                "} ";
    }
}

class Point{
    protected int x;
    protected  int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.println("Point.print " + toString());
    }

    @Override
    public String toString() {
        return  "{x=" + x +
                ", y=" + y +
                '}';
    }
}