package lesson12.hm1;

public class Tred2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2 run Thread id " + Thread.currentThread().getId());
        }
    }
}
