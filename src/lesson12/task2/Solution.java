package lesson12.task2;

public class Solution {
    public static void main(String[] args) {
        Runnable r1 = new MyThread();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
