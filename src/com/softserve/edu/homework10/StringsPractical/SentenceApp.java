package com.softserve.edu.homework10.StringsPractical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceApp {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		
		String sentence;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter your sentence: ");
			sentence = br.readLine();
//			System.out.printf("%nIt's your sentence: \"%s\"!!!", sentence);
			Pattern pat = Pattern.compile("[a-zA-Z]+");
			Matcher match = pat.matcher(sentence);
			while (match.find()) {
				words.add((sentence.substring(match.start(), match.end())));
				System.out.printf("Added [ %s ] to list of words.%n", (sentence.substring(match.start(), match.end())));
			}
			String longestWord="";
			int longestWordIndex=0;
			for (String word:words) {
				if (word.length()>longestWord.length()) {
					longestWordIndex= words.indexOf(word);
					longestWord= word;
				}
			}
			System.out.printf("Longest word in sentence is: %s. It has : %d letters.%n", longestWord, longestWord.length());
			System.out.println("Second word in reverce order is: " + new StringBuilder(words.get(1)).reverse());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
