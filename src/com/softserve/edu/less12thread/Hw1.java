package com.softserve.edu.less12thread;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread = " + Thread.currentThread().getId());
        Message2 mess1 = new Message2("Thread 1st", 3000, 3);
        Message2 mess2 = new Message2("Thread 2nd", 2000, 5);
        Message2 mess3 = new Message2("Thread 3rd", 1000, 2);
/*        Runnable rMess1 = new Message1("Thread 1st", 1000, 2);
        Thread mess1 = new Thread(rMess1);
        Runnable rMess2 = new Message1("Thread 2nd", 2000, 2);
        Thread mess2 = new Thread(rMess2);
        Runnable rMess3 = new Message1("Thread 3rd", 3000, 2);
        Thread mess3 = new Thread(rMess3);
*/        mess1.start();
        mess2.start();
        mess3.toJoin(mess1);
        mess3.toJoin(mess2);
        mess3.start();
        mess1.join();
        mess2.join(); //mess2.
        mess3.join();

        System.out.println("Main done.");
    }


}
