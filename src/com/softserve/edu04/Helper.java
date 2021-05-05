package com.softserve.edu04;

public final class Helper {
    private static String message; // = "Hello";

    static {
        message = "Hello World";
        System.out.println("First message = " + message);
    }

    private Helper() {
    }

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}
