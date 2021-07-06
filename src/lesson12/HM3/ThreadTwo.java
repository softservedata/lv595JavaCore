package lesson12.HM3;

import lesson12.hm1.Tred3;

public class ThreadTwo extends Thread {
    @Override
    public void run() {
        //Thread th3 = new ThreadTree();
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 2 Thread ID " + Thread.currentThread().getId());
        }
        //  th3.start();
        Runnable thread3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 3 lambda run Thread ID " + Thread.currentThread().getId());
            }
        };
        new Thread(thread3).start();
        try {
            new Thread(thread3).join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
