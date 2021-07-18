package com.softserve.lesson12.task1;

public class MyThread extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

