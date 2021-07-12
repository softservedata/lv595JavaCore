package com.softserve.lesson8.shape;

public class Appl {
    public static void main(String[] args) {
        WrapperShape<Shape> square = new WrapperShape<>();
        WrapperShape<String> ci = new WrapperShape<>();
        System.out.println(ci.getOb());
    }
}
