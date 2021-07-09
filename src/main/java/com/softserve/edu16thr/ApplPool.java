package com.softserve.edu16thr;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable {
	private int i;

	public Worker(int i) {
		this.i = i;
	}

	public void run() {
		synchronized (ApplPool.monitor) {
			System.out.println("i = "+ i + " ID = " + Thread.currentThread().getId());
		}
	}
}

public class ApplPool {
	public static Object monitor = new Object();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 11; i++) {
			Runnable worker = new Worker(i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
			System.out.print("*");
		}
	}
}
