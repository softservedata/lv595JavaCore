package edu.homework12.Threads;

public class HelloWorlsApp {

	public static void main(String[] args) throws InterruptedException {
		String message1 = "Hello, World";
		String message2 = "Peace in the peace";

		int sleepTime1 = 2;
		int sleepTime2 = 3;

		Thread first = new MyThreadExample(message1, sleepTime1);
		Thread second = new MyThreadExample(message2, sleepTime2);

//		Run method executes specific thread until it's finished
		first.run();
		second.run();

//		Start method executes thread in parallel with other threads
		first.start();
		second.start();

//		Waits until all threads in mail thread are finished, then finishes main method
		first.join();
		second.join();

		System.out.println("Finished running main!");
		System.out.println("My Name is Nazar");

	}

}
