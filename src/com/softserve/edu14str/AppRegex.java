package com.softserve.edu14str;

//import java.util.ArrayList;
//import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppRegex {
	public static void main(String[] args) {
		// String pattern = "Now is the time";
		// String pattern = "[ Na-z]+";
		//String pattern = "[a-z]+";
		//String text = "Now is the time";
		//
		//String pattern ="[bt]{2}";
		//String pattern ="(\\w)\\1"; // Java String: \\ -> \
		String pattern = "\\b\\w*([\\w])\\1\\w*\\b";
		String text = "letter abba work abtc";
		//
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		//
		// 2. Get all parts
		m.reset(); // Reset Iterstor
		//List<String> list = new ArrayList<>();
		while (m.find()) {
			/*-
			String sNum = text.substring(m.start(), m.end());
			sNum = sNum.replaceAll("[,']", "");
			System.out.println("sNum = " + sNum);
			double num = Double.valueOf(sNum);
			System.out.println("num + 1 = " + (num + 1.11));
			*/
			// System.out.println("grop1 = " + m.group(1));
			//
			System.out.print(text.substring(m.start(), m.end()) + "*");
			// System.out.print(text.substring(m.start() + 1, m.end() - 1).trim() + "*");
			//list.add(text.substring(m.start(), m.end()));
		}
		/*-
		System.out.println("LIST:");
		for (String current : list) {
			System.out.println(current);
			//double price = Double.valueOf(current.replaceAll("'|,", ""));
			//System.out.printf("(price+1) = %.2f",(price + 1));
		}
		*/

	}
}
