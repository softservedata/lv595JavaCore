package com.softserve.lesson12.HM3;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new ThreadOne();
        Thread t1 = new Thread(r1);
        System.out.println("Thread main start ID thread is " + Thread.currentThread().getId());
        t1.start();
        t1.join();
        System.out.println("Thread main done ");
    }
}
