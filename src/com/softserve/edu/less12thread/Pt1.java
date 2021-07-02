package com.softserve.edu.less12thread;

public class Pt1 {
    public static void main(String[] args){
        for (int i =0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
