package com.softserve.edu04;

public class Tappl {
    
    static {
        System.out.println("Tappl Static block");
    }
    
    public static void main(String[] args) {
        System.out.println("Start");
        //Helper.setMessage("hello1");
        Helper.print();
        //
        // Not recommended:
        //Helper helper = new Helper();
        //helper.setMessage("new message");
        //helper.print();
    }

}
