package com.softserve.edu.homework12.Threads;

public class MyThreadExample extends Thread {

	String message;
	int sleepTime;
	String ID;

	public MyThreadExample() {
	}

	public MyThreadExample(String message, int sleepTime) {
		this.message = message;
		this.sleepTime = (sleepTime * 1000);
	}

	public MyThreadExample(String message, String ID) {
		this.message = message;
		this.ID = ID;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(message + " .ID: " + Thread.currentThread().getId() + " . Name: "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				System.out.println("FFs");
				e.printStackTrace();
			}
		}
		System.out.printf("Thread with text \"%s\" finished running.\n", message);
	}

}
