package com.softserve.edu.less12thread;
import java.util.*;

public class Message2 extends Thread{
    protected String msg;
    protected long interval;
    protected int times;
    protected List<Thread> toJoin = new ArrayList<>();

    public Message2 (String msg, long interval, int times){
        this.msg = msg;
        this.interval = interval;
        this.times = times;
        System.out.println(msg + " objectId = " +
//                Thread.currentThread().getId());
                this.getId());
    }

    public java.lang.String getMsg() {
        return msg;
    }

    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
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