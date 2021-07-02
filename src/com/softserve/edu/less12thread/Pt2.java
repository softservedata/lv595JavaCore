package com.softserve.edu.less12thread;

import java.util.ArrayList;
import java.util.List;

public class Pt2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread = " + Thread.currentThread().getId());
       Message2 mess1 = new Message2("Hello World", 1000, 5);
       Message2 mess2 = new Message2("Peace in the peace", 3000, 5);
       mess1.start();
       mess2.start();
        mess1.join();
        mess2.join(); //mess2.
        System.out.println("My name is Vasyl.");
    }
}
/*
class Message1 extends Thread{
    private String msg;
    private long interval;
    private int times;
//    private Thread toJoin;
    public Message1 (String msg, long interval, int times){
        this.msg = msg;
        this.interval = interval;
        this.times = times;
        System.out.println("Mess1 thread = " + this.currentThread().getId());
    }

    public void toJoin(Thread threadToJoin){
        try {
            threadToJoin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + this.currentThread().getId() + " joined to " +
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
*/
class Message2 extends Thread{
    private String msg;
    private long interval;
    private int times;
    private List<Thread> toJoin = new ArrayList<>();
    public Message2 (String msg, long interval, int times){
        this.msg = msg;
        this.interval = interval;
        this.times = times;
        System.out.println("Mess2 thread = " +
                Thread.currentThread().getId());
//                this.getId());
    }

    public void toJoin(Thread threadToJoin){
        toJoin.add(threadToJoin);

    }

/*
    public void toJoin(Thread threadToJoin){
        try {

            threadToJoin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " +
//                this.getId() +
                Thread.currentThread().getId() +
                " joined to " +
                threadToJoin.getId() );

    }

*/
    //    @Override
    public void run()  {
        for (Thread currentthread : toJoin){
            try {
                currentthread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + this.getId() + " joined to " +
                    currentthread.getId() );
        }
        for (int i =0 ; i < times-1; i++){
            System.out.println("Tread "+
//                    this.getId() +
                      Thread.currentThread().getId() +
                    " - "+msg);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tread "+ this.getId() + " - " +msg + " last!");
    }
}