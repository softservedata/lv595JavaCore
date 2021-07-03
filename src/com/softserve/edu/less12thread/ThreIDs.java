package com.softserve.edu.less12thread;

import java.util.*;

public class ThreIDs {
    static Map<Long, Long> notEqualsIds = new HashMap<>();

    public static void main(String[] args) {
        ArrayList<Message3> threads = new ArrayList<>();
        Random rnd = new Random();
        int numItteration = 1000000;

        for(int i = 0 ; i < numItteration; i++){
            threads.add(new Message3("thrd"+i,rnd.nextInt(3000),rnd.nextInt(5)));
            if (i >numItteration/2)
                threads.get(i).toJoin(threads.get(rnd.nextInt(i)));
        }

        for(int i = 0 ; i < numItteration; i++) {
            threads.get(i).start();
            System.out.println("Starting thread #"+i);
        }
        try {
            threads.get(threads.size()-1).join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads IDs: " + notEqualsIds);

    }

    static class Message3 extends Thread{
        private String msg;
        private long interval;
        private int times;
        private List<Thread> toJoin = new ArrayList<>();
        public Message3 (String msg, long interval, int times){
            this.msg = msg;
            this.interval = interval;
            this.times = times;
//            System.out.println("Mess2 thread = " +
//                    Thread.currentThread().getId());
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
//                System.out.println("Thread " + this.getId() + " joined to " +
//                        currentthread.getId() );
            }
            for (int i =0 ; i < times-1; i++){
/*                System.out.println("Tread "+
//                    this.getId() +
                        Thread.currentThread().getId() +
                        " - "+msg);
*/                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            System.out.println("Tread "+ this.getId() + " - " +msg + " last!");
//            for
            if (Thread.currentThread().getId()!=this.getId())
            notEqualsIds.put(Thread.currentThread().getId(),this.getId());

        }
    }
}
