package com.softserve.lesson11.plants;

import java.util.Locale;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.type = t;
        this.color = c;
        this.size = size;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "white":
                return Color.White;
            default:
                throw new ColorException("Input only color blue, red and white ");
        }

    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "flower":
                return Type.Flower;
            case "tree":
                return Type.Tree;
            case "bush":
                return Type.Bush;
            default:
                throw new TypeException("Input only type flower, tree and bush ");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }



}
