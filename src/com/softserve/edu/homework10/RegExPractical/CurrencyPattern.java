package com.softserve.edu.homework10.RegExPractical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyPattern {
	public static void output (int i) {
		System.out.println("int" + i);
	}
	public static void output (Integer i) {
		System.out.println("Integer" + i);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		String text = br.readLine();
		String text = "I make $34,345.98 a year. And my friend is making $39,234.92 a year. Also few more numbers for fun: $232,234,232.00 and $23.00";
		Pattern currency = Pattern.compile("(\\$([\\d\\,]*)(\\.)(\\d{2}))");
		Matcher match = currency.matcher(text);
		System.out.println("Value: " + text.charAt(0));
		
		while (match.find()) {
			System.out.println("Currency found:\n\t" + text.substring(match.start(), match.end()));
		}

		System.out.println("Done checking text.");
		
		CurrencyPattern.output(3);
		
	}

}
