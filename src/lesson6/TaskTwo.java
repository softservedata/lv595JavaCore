package lesson6;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print() {
        System.out.println("Point print " + toString());
    }
}

class Line {
    Point pointone;
    Point pointtwo;

    public Line(Point pointone, Point pointtwo) {
        this.pointone = pointone;
        this.pointtwo = pointtwo;
    }

    @Override
    public String toString() {
        return "{point1st=" + pointone +
                ", point2nd=" + pointtwo +
                "} ";
    }

    public void print() {
        System.out.println("Line print " + toString());
    }
}

class ColorLine extends Line {
    public String Color;

    public ColorLine(Point pointone, Point pointtwo, String color) {
        super(pointone, pointtwo);
        this.Color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "pointone=" + pointone +
                ", pointtwo=" + pointtwo +
                ", Color='" + Color + '\'' +
                '}';
    }

    public void print() {
        System.out.println("ColorLine print " + toString());
    }
}

public class TaskTwo {
    public static void main(String[] args) {
        Line[] lin = {new Line(new Point(18, 10), new Point(93, 18)),
                new ColorLine(new Point(90, 45), new Point(33, 75), "Green"),
                new Line(new Point(51, 84), new Point(99, 32)),
                new ColorLine(new Point(64, 82), new Point(54, 61), "Yellow")};
        for (Line i : lin) {
            i.print();
        }
        System.out.println(lin);

    }
}

