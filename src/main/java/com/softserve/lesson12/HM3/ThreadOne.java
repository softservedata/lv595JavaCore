package com.softserve.lesson12.HM3;

public class ThreadOne implements Runnable {
    Thread th2 = new ThreadTwo();

    @Override
    public void run() {
        System.out.println("Thread 1 start");
        th2.start();
        try {
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
