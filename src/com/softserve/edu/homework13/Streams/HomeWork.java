package com.softserve.edu.homework13.Streams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork {
	String encrypt(String text, int n) {
		System.out.println("Original String: " + text);
		byte[] bytes = text.getBytes();
		for (int i = 0; i < bytes.length; i++) {
//			System.out.println(bytes[i]);
			if ((bytes[i] < 91) && (((byte) (bytes[i] + n)) > 90)) {
//				System.out.println("Byte before adding" + bytes[i]);
				bytes[i] = (byte) (64 + ((bytes[i] + n) - 90));
//				System.out.println("Byte after adding" + bytes[i]);
			} else if ((bytes[i] < 123) && (((byte) (bytes[i] + n)) > 122) || ((byte) (bytes[i] + n)) < 0) {
				bytes[i] = (byte) (96 + ((bytes[i] + n) - 122));
			} else {
				bytes[i] = (byte) (bytes[i] + n);
			}
//			System.out.println(bytes[i]);
		}
		String encrypted = new String(bytes);
		System.out.println("Encrypted String: " + encrypted);
		return encrypted;
	}

	String decrypt(String text, int n) {
		System.out.println("Original String: " + text);
		byte[] bytes = text.getBytes();
		for (int i = 0; i < bytes.length; i++) {
//			System.out.println(bytes[i]);
			if ((bytes[i] > 64) && (((byte) (bytes[i] - n)) < 65)) {
//				System.out.println("going though 1 condition. Before:  " + bytes[i]);
				bytes[i] = (byte) (91 - (65 - (bytes[i] -n)));
//				System.out.println("going though 1 condition. After:  " + bytes[i]);
			} else if ((bytes[i] > 96) && (((byte) (bytes[i] - n)) < 97)) {
//				System.out.println("going though 2 condition. Before:  " + bytes[i]);
				bytes[i] = (byte) (123 - (97 - (bytes[i] -n)));
//				System.out.println("going though 1 condition. After:  " + bytes[i]);
			} else {
//				System.out.println("going though 3 condition. Before:  " + bytes[i]);
				bytes[i] = (byte) (bytes[i] - n);
//				System.out.println("going though 3 condition. Ater:  " + bytes[i]);
			}
		}
		String encrypted = new String(bytes);
		System.out.println("Decrypted String: " + encrypted);
		return encrypted;
	}

	void dateValidator (Object date) {
		Pattern dateFormat = Pattern.compile("(([0-1]{1}[0-9]{1}).([0-3]{1}[0-9]{1}).([0-9]{2}))");
		Matcher check = dateFormat.matcher(String.valueOf(date));
		if (check.find()) {
			System.out.println("Date in correct format: " + date);
		} else {
			System.out.println("Check your date format: " + date);
		}
		
	}
	public static void main(String[] args) {
		


//		Homework 1
		ArrayDeque<String> list1 = new ArrayDeque<String>();
		list1.add("String One");
		list1.add("String Two");
		list1.add("String Three");
		list1.add("String Four");
		list1.add("String Five");
		list1.add("String Six");
		list1.add("String Seven");
		list1.add("String Eight");
		list1.add("String Nine");
		list1.add("String Ten");

		list1.forEach(System.out::println);
		ArrayDeque<String> list2 = list1;

		list2.removeIf((i -> i.length() > 10));
		System.out.println("Filtered string");
		list2.forEach(System.out::println);

//		Homework 2
		System.out.println("\n\tPrinting Homewrok2\n");

		String encrypted = new HomeWork().encrypt("ZzAaBbCcXxWwzZ", 1);
		new HomeWork().decrypt(encrypted, 1);
		String encrypted1 = new HomeWork().encrypt("ZzAaBbCcXxWwzZ", 3);
		new HomeWork().decrypt(encrypted1, 3);
		String encrypted2 = new HomeWork().encrypt("ZzAaBbCcXxWwzZ", 7);
		new HomeWork().decrypt(encrypted2, 7);

		String encrypted3 = new HomeWork().encrypt("ZzAaBbCcXxWwzZ", 10);
		new HomeWork().decrypt(encrypted3, 10);

		String encrypted4 = new HomeWork().encrypt("ZzAaBbCcXxWwzZ", 15);
		new HomeWork().decrypt(encrypted4, 15);

		String encrypted5 = new HomeWork().encrypt("ZzAaBbCcXxWwzZ", 20);
		new HomeWork().decrypt(encrypted5, 20);
		
//		Homework 3
		System.out.println("\n\tPrinting Homewrok3\n");

		LocalDate newDate = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.YY");
		new HomeWork().dateValidator(newDate); // Passing date in wrong format to method - fails validation
		format.format(newDate);
		new HomeWork().dateValidator(format.format(newDate)); // Passing date in right format - passes validation
		

	}
}
