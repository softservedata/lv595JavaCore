package com.softserve.edu;

import java.util.List;

/**
 * Super Class
 * @author Lv595
 *
 */
public class Example {

    private static int i;
    private int j;

    public static void m1() {
        System.out.println("m1() i = " + i);
    }

    public void m2() {
        System.out.println("m2() running m1(), i = " + i + "  j = " + j);
        m1();
        i = 5555;
    }

    public static void main(String[] args) {
        List<String> l;
        System.out.println("Hello");
        i = 123;
        System.out.println("i = " + i);
        // m1();
        //
        Example ex = new Example();
        ex.j = 234;
        ex.m2();
        System.out.println("ex.j = " + ex.j);
        //
        Example ex2 = new Example();
        ex2.j = 4321;
        ex2.m2();
        System.out.println("ex2.j = " + ex2.j);
        //
        System.out.println("ex.j = " + ex.j + "  ex2.j = " + ex2.j);
        //
        for (int i=0; i<args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]); 
        }
    }

}
