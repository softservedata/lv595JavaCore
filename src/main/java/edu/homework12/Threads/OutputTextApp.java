package edu.homework12.Threads;

public class OutputTextApp {

	public static void main(String[] args) throws InterruptedException {

		String text = "I study JAVA";

		for (int i = 0; i < 10; i++) {
			System.out.printf("Printed text \"%s\" %d times%n", text, (i + 1));
			Thread.sleep(1000);
		}
		System.out.println("Done Printing");
	}

}
