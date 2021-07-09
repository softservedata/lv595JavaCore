package com.softserve.edu;

public class Appl {
    public static void main(String[] args) {
        /*-
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.println("a + b = " + (a + b));
        sc.close();
        */
        //
        Calc calc = new Calc();
        Communicator cm = new Communicator();
        double a = cm.readDouble("a = ");
        double b = cm.readDouble("b = ");
        System.out.println("res = " + calc.add(a, b));
    }
}
