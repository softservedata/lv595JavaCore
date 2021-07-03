package com.softserve.edu.less12thread;

import static java.lang.System.*;

public class Hw2 {
    public static boolean umova = false;

    public static void main(String[] args) {
        Runnable hw2r = new Hw2Runnable();
        Thread hw2t = new Thread(hw2r);
        hw2t.start();
//        hw2t.interrupt();
        while (hw2t.isAlive()){
            System.out.println("main is waiting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main() finish");

    }
}
class Hw2Runnable implements Runnable {
    private boolean Hw2umova = true;
    public void run( ) {
        long sum = 0;
        while(Hw2umova){
            System.out.println("tw2tread" + sum++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (sum == 20) {
                Thread.currentThread().interrupt();//;
//                Hw2.umova = true;
            }
        }
//        System.out.println(sum);
    }
}