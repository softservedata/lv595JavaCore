package com.softserve.edu.homework12.Threads;

class MyThread extends Thread {
	String message;

	public MyThread() {
	}

	public MyThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		int counter = 0;
		while (Thread.currentThread().isAlive()) {
			System.out.println("Setting MyThread to sleep.");
			MyThread.yield();
			counter++;
			if (counter > 1000) {
				System.out.println("\n\nMyThread run for too long!!!\n\n");
				break;
			}
		}
		System.out.println("My stread is completed.");

	}

}

public class DeadLockApp {
	public static void main(String[] args) throws InterruptedException {

		Thread myThread = new MyThread("let's make lock");

		myThread.start();
		while (myThread.isAlive()) {
			int counter = 0;
			System.out.println("Setting currrent thread to sleep. Thread name: " + Thread.currentThread().getName());
			Thread.currentThread().yield();
			if (counter > 1000) {
				System.out.println("\n\nMyThread run for too long!!!\n\n");
				break;
			}

		}
		System.out.println("Thread Main is completed.");
	}
}
