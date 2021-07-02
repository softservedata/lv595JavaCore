package lesson12.hm1;

public class Tred1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<5;i++){
            System.out.println("Thread 1 run Thread id " + Thread.currentThread().getId());
        }

    }
}
