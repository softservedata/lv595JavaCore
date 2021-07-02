package lesson12.hm1;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main run ");
        Runnable thread1 = new Tred1();
        Runnable thread2 = new Tred2();
        Runnable thread3 = new Tred3();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        System.out.println("Thread Main done Thread id " + Thread.currentThread().getId());
    }
}
