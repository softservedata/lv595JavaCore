package com.softserve.edu.less8.Hworks;

import java.time.temporal.ValueRange;

public class HwT2 {
    public static void main(String[] args) {
        Wrapper i = new Wrapper(123);
        Wrapper Str = new Wrapper("456");
        Wrapper bool = new Wrapper(true);

        System.out.println("integer i = 123 <-> " + i.getValue());
        System.out.println("String Str = \"456\" <-> " + Str.getValue());
        System.out.println("boolean bool = true <-> " + bool.getValue());


        System.out.println("Conversions:");
        Integer j = (Integer) i.getValue();
        System.out.println("i -> j = " + j);
//        j = (Integer) bool.getValue();
        System.out.println("bool -> j = " + j);
//        j = (Integer) Str.getValue();
        System.out.println("Str -> j = " + j);

    }
}

//---------------------------------------

class Wrapper<T>{
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = (T) value;
    }

}


