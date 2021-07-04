package com.softserve.edu.less12thread;

import java.lang.*;

import static java.lang.Thread.currentThread;

public class Message3 extends Message2 {
    private Message3 master = null;
    private boolean finish = false;
    private Object svitlofor;

    public Message3(String msg, long interval, int times, Message3 master) {
        super(msg, interval, times);
        this.master = master;

    }

    public Message3(String msg, long interval, int times, Object svitlofor) {
        super(msg, interval, times);
        this.svitlofor = svitlofor;
    }

    public void setMaster(Message3 master) {
        this.master = master;
//        System.out.println(master.getId() + " is master for " + Thread.currentThread().getId());
    }

    public Message3 getMaster() {
        return master;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    @Override
    public  void run() {
//        super.run();
/*        for (Thread currentthread : toJoin){
            try {
                currentthread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + this.getId() + " joined to " +
                    currentthread.getId() );
        }
*/
        if (master == null)
            System.out.println("Here is no master for " + msg + Thread.currentThread().getId());
        else
            System.out.println(master.getId() + " is master for " +msg+ Thread.currentThread().getId());
/*        while (!finish) {
            synchronized (svitlofor) {
                System.out.println(msg + " is working");
                if (master == null || master.isFinish()) {
                    for (int i = 0; i < times - 1; i++) {
                        System.out.println("Tread " +
                                Thread.currentThread().getId() +
                                " - " + msg);
                  }

                    System.out.println("Tread " + this.getId() + " - " + msg + " last!");
                    finish = true;
                } else {
                }
                System.out.println(msg + " notifyAll");
                svitlofor.notify();
            }
        }
*/
            while (master != null && !master.isFinish()) {
                System.out.println(msg + " sleeping.");
//                svitlofor.notify();
//                Thread.yield();
                try {
                    Thread.sleep((long) (master.getInterval()*master.getTimes()*0.3));//super.interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(msg + " is working");
//        synchronized (svitlofor) {
//               if () {
                    for (int i = 0; i < times - 1; i++) {
                        System.out.println("Tread " +
                                Thread.currentThread().getId() +
                                " - " + msg);
                        try {
                            Thread.sleep(super.interval);//super.interval);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Tread " + this.getId() + " - " + msg + " last!");
                    finish = true;
//            svitlofor.notify();
//                }
    }
}
