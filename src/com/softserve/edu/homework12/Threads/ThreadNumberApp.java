package com.softserve.edu.homework12.Threads;

class MyThread1 extends Thread{
	String message;
	Thread t2;
		
	public MyThread1() {
	}
	
	public MyThread1(String message, Thread thread) {
		this.message=message;
		t2 = thread;	
	}
	
		
	public void run() {
		System.out.printf("Thread %s started.%n", Thread.currentThread().getName());
		System.out.printf("Running %s, ID: %d.%n",message ,Thread.currentThread().getId());
		try {
			t2.start();
			System.out.printf("Thread %s started.%n", Thread.currentThread().getName());
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("Thread %s terminated.%n", Thread.currentThread().getName());
	}
}

class MyThread2 extends Thread{
	String message;
	int outputNumber;
	Thread t3;
		
	public MyThread2() {
	}
	
	public MyThread2(String message, int outputNumber, Thread thread) {
		this.message=message;
		this.outputNumber=outputNumber;
		t3 = thread;
	}
			
	public void run() {
		System.out.printf("Running %s, ID: %d.%n",message ,Thread.currentThread().getId());
		int counter=0;
		while (counter<outputNumber) {
			System.out.println(message);
			counter++;			
		}
		try {
			t3.start();
			System.out.printf("Thread %s started.%n", Thread.currentThread().getName());
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("Thread %s terminated.%n", Thread.currentThread().getName());
	}
}

class MyThread3 extends Thread{
	String message;
	int outputNumber;
	
		
	public MyThread3() {
	}
	
	public MyThread3(String message, int outputNumber) {
		this.message=message;
		this.outputNumber=outputNumber;
	}
			
	public void run() {
		System.out.printf("Running %s, ID: %d.%n",message ,Thread.currentThread().getId());
		int counter=0;
		while (counter<outputNumber) {
			System.out.println(message);
			counter++;			
		}
		System.out.printf("Thread %s terminated.%n", Thread.currentThread().getName());;
	}
}

public class ThreadNumberApp {
	public static void main(String[] args) throws InterruptedException {
		Thread t3 = new MyThread3("Thread number three", 5);
		Thread t2 = new MyThread2("Thread number two", 3, t3);
		Thread t1 = new MyThread1("Thread number one", t2);
		
		t1.start();
		t1.join();
	
		System.out.printf("Thread %s terminated.%n", Thread.currentThread().getName());
	}

}
