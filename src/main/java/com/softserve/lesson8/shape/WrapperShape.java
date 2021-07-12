package com.softserve.lesson8.shape;

public class WrapperShape<Shape> {
    private Square  ob = new Square();
    private Circle ob2 = new Circle();

    public Square getOb() {
        return ob;
    }

    public void setOb(Square ob) {
        this.ob = ob;
    }

    public Circle getOb2() {
        return ob2;
    }

    public void setOb2(Circle ob2) {
        this.ob2 = ob2;
    }

    @Override
    public String toString() {
        return "WrapperShape{" +
                "ob=" + ob +
                ", ob2=" + ob2 +
                '}';
    }
}
