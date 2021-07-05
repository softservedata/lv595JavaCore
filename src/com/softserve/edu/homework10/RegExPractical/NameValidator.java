package com.softserve.edu.homework10.RegExPractical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {
	public static void main(String[] args) {

		Pattern validator = Pattern.compile("[_a-zA-Z0-9]{3,15}");
		for (String arg : args) {

			Matcher match = validator.matcher(arg);
			if (match.matches()) {
				System.out.println("Valid user name: " + arg);
			} else {
				System.out.println("Invalid user name: " + arg);
			}
		}
	}

}
