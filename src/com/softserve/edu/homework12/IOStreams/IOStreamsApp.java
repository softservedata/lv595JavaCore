package com.softserve.edu.homework12.IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOStreamsApp {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\nivankiv\\eclipse-workspace\\lv595JavaCore\\src\\com\\softserve\\edu\\homework12\\IOStreams\\mytext.txt";
		String outputFile1 = "C:\\Users\\nivankiv\\eclipse-workspace\\lv595JavaCore\\src\\com\\softserve\\edu\\homework12\\IOStreams\\MyOutputFile.txt";
		String outputFile2 = "C:\\Users\\nivankiv\\eclipse-workspace\\lv595JavaCore\\src\\com\\softserve\\edu\\homework12\\IOStreams\\FirstOutput.txt";

		List<String> linesFromFile = new ArrayList<>();
		List<String> linesWithNumberign = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				linesFromFile.add(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Iterator<String> iterate = linesFromFile.listIterator();
		int lineLegth = 0;
		String lineText;
		int longest = 0;
		int shortest = 1000000;
		String logestLine = "";
		String shortestLine = "";

		Pattern pattern = Pattern.compile("eve");
		Matcher match;

		List<String> matched = new ArrayList<>();

		while (iterate.hasNext()) {
			lineText = iterate.next();
			lineLegth = lineText.length();
			match = pattern.matcher(lineText);
			if (match.find()) {
				matched.add(lineText);
			}
			if (lineLegth == 0) {
				continue;
			}
			if (lineLegth > longest) {
				logestLine = lineText;
				longest = lineLegth;
			}
			if (lineLegth < shortest) {
				shortest = lineLegth;
				shortestLine = lineText;
			}

			System.out.println(lineText.concat(". Number of symbols in the line: ".concat(String.valueOf(lineLegth))));
			linesWithNumberign
					.add(lineText.concat(". Number of symbols in the line: ".concat(String.valueOf(lineLegth))));
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile1))) {
			bw.append("Writing lines with numbers of symbols in each");
			bw.newLine();
			for (String current : linesWithNumberign) {
				bw.append(current);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile2))) {
			bw.append("\tWriting longest and shortest lines.\n");
			bw.newLine();

			System.out.printf("Sortest line is \"%s\", it had %d symbols.%n", shortestLine, shortest);
			System.out.printf("Longest line is \"%s\", it had %d symbols.%n", logestLine, longest);

			bw.append(shortestLine.concat(" - SHORTEST."));
			bw.newLine();
			bw.append(logestLine.concat(" - LONGEST."));
			bw.newLine();
			bw.append(String.format("%n\tWriting all matteches to pattern \"%s\" to the file.%n", pattern));

			for (String current : matched) {
				System.out.println("Matched pattern: " + current);
				bw.append(current);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
