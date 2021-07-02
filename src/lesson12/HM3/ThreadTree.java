package lesson12.HM3;

public class ThreadTree extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 3 run Thread ID " + Thread.currentThread().getId());
        }

    }
}
