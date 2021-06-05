package com.softserve.edu.less8.Hworks;

public class Pt2 {
    public static void main(String[] args) {
       WrapperShape squareWrapper = new WrapperShape(new Square());
        System.out.println("Square has a " + (squareWrapper.numOfVertex()));
        WrapperShape circleWrapper = new WrapperShape(new Circle(12.5));
        System.out.println("Circle has a " + (circleWrapper.numOfVertex()));
//        WrapperShape helloWrapper = new WrapperShape("Hello!!");
    }
}

class WrapperShape<T>{
    private Shape figure;

    public WrapperShape(Square argFigure) {
        figure = new Square();
//        this.figure = figure;
    }

    public WrapperShape(Circle argFigure) {
        figure = new Circle(argFigure.getRadius());
//        this.figure = figure;
    }
/*
    public String numOfVertex() {
    return "";
    }
*/
//    @Override
    public int numOfVertex(){
        return  figure.numOfVertex();
    }
}

////////////////////////////////////////////

class Circle implements Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("It's a circle!");
    }

    @Override
    public int numOfVertex() {
        return (int) (Math.PI*2*radius/0.5);
    }
}

/////////////////////////////////////////1
class Square implements Shape{
    public Square() {
        System.out.println("It's a square");
    }

    @Override
    public int numOfVertex() {
        return 4;
    }
}


///////////////////////////////////
interface Shape{
    public int numOfVertex();
}