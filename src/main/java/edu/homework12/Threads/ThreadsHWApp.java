package edu.homework12.Threads;

public class ThreadsHWApp {
	public static void main(String[] args) throws InterruptedException {
		String message1 = "I\'m first thread";
		String message2 = "I\'m second thread";
		String message3 = "I\'m third thread";

		Thread first = new MyThreadExample(message1, "1st");
		Thread second = new MyThreadExample(message2, "2nd");
		Thread third = new MyThreadExample(message3, "3rd");

		first.setPriority(10);
		second.setPriority(10);
		third.setPriority(1);

		first.start();
		second.start();
		first.join();
		second.join();

		if (!first.isAlive() && !second.isAlive()) {
			third.start();
		}

		System.out.println("Current tread ID is : " + Thread.currentThread().getId() + " . Current Thread name: "
				+ Thread.currentThread().getName());

//		third.join();

		System.out.println("Thread main is terminated.");

	}
}
