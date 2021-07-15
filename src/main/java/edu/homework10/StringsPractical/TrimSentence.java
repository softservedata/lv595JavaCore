package edu.homework10.StringsPractical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrimSentence {
	public static void main(String[] args) {
		String sentence = "Keep following            your         dreams   and      never    give    up.";

		StringBuilder newSentence = new StringBuilder(sentence);
		System.out.println("Original sentence:\n\t" + sentence);

		Pattern blanks = Pattern.compile(" {2,}");
		Matcher match = blanks.matcher(newSentence);

		while (match.find()) {
//			System.out.println("Found blank at:" + match.start() + " " + match.end());
			newSentence.replace(match.start(), match.end(), " ");
			match.reset();
		}

		System.out.println("Sentence with blanks replaced:\n\t" + newSentence);
	}
}
