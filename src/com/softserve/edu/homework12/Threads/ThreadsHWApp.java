package com.softserve.edu.homework12.Threads;

public class ThreadsHWApp {
	public static void main(String[] args) {
		String message1 = "I\'m first thread";
		String message2 = "I\'m second thread";
		String message3 = "I\'m third thread";
		
		Thread first = new MyThreadExample(message1);
		Thread second = new MyThreadExample(message2);
		Thread third = new MyThreadExample(message3);
		
		third.start();
		
	}
}
