package com.softserve.edu.less12thread;

public class Message1 implements Runnable{ //extends Thread{
    private String msg;
    private long interval;
    private int times;
    //    private Thread toJoin;
    public Message1 (String msg, long interval, int times){
        this.msg = msg;
        this.interval = interval;
        this.times = times;
        System.out.println("Mess1 thread = " + Thread.currentThread().getId());
    }

    public void toJoin(Thread threadToJoin){
        try {
            threadToJoin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " joined to " +
                threadToJoin.currentThread().getId() );
    }

    //    @Override
    public void run()  {
        for (int i =0 ; i < times-1; i++){
            System.out.println(msg);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg + " last!");
    }
}

