package com.softserve.edu.less8.Hworks;

public class Pt2a {
    public static void main(String[] args) {
       Vrapper<Shape> squareWrapper = new Vrapper<>(new Square());
        System.out.println("Square has a " + (squareWrapper.numOfVertex()));
        Vrapper<Shape> circleWrapper = new Vrapper<>(new Circle(12.5));
        System.out.println("Circle has a " + (circleWrapper.numOfVertex()));
        Vrapper<String> stringWrapper = new Vrapper<>("Hello!!");
    }
}

class Vrapper<Shape>{
    private Object figure;

    public Vrapper(Square argFigure) {
        figure = new Square();
//        Square figure = new Square();
//        this.figure = (Shape) figure;
    }

    public Vrapper(Circle argFigure) {
        figure = new Circle(argFigure.getRadius());
//        Circle figure = new Circle(argFigure.getRadius());
//        this.figure = (Shape) figure;
    }
/*
    public String numOfVertex() {
    return "";
    }
*/
//    @Override
    public int numOfVertex(){
        if(figure instanceof Square)
           return  ((Square) figure).numOfVertex();
        if(figure instanceof Circle)
            return  ((Circle) figure).numOfVertex();
        return -1;
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

