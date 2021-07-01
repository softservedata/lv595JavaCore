package lesson12.task2;

public class MyThread implements Runnable {
    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello,World! ");
                Thread.sleep(2000);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace ");
                Thread.sleep(3000);
            }
            System.out.println("My name is Murad");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
