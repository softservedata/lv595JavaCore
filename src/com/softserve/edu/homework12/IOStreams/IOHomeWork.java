package com.softserve.edu.homework12.IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOHomeWork {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\nivankiv\\eclipse-workspace\\lv595JavaCore\\src\\com\\softserve\\edu\\homework12\\IOStreams\\file1.txt";
		String outputFile = "C:\\Users\\nivankiv\\eclipse-workspace\\lv595JavaCore\\src\\com\\softserve\\edu\\homework12\\IOStreams\\file2.txt";
		List<String> linesList = new ArrayList<>();
		Map<String, String> resultsMap = new HashMap<>();

		try (BufferedReader readFile = new BufferedReader(new FileReader(fileName))) {
			String line;
			int lineCounter = 0;
			int emptyLinesCounter = 0;
			String longestLineText = "";
			int longestLine = 0;
			while ((line = readFile.readLine()) != null) {
				lineCounter++;
				if (line.length() != 0) {
					longestLine = (longestLine > line.length()) ? longestLine : line.length();
					longestLineText = (longestLine > line.length()) ? line : longestLineText;
					System.out.println("\t\tAdded line to the array.");
					linesList.add(line);
				} else {
					System.out.println("\tFound empty line.");
					emptyLinesCounter++;
				}
			}
			resultsMap.put("lineCounter", String.valueOf(lineCounter));
			resultsMap.put("longestLine", String.valueOf(longestLine));
			resultsMap.put("longestLineText", longestLineText);
			System.out.printf("Number of lines in file %d. %d of them were empty.\n", lineCounter, emptyLinesCounter);
			System.out.printf("The longest line is \"%s\". It''s length is %d characters.\n", longestLineText,
					longestLine);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
			bw.append("\nNumber of lines in the input file: ").append(resultsMap.get("lineCounter"));
			bw.newLine();
			bw.append("\nLongest line is:\n").append(resultsMap.get("longestLineText"))
					.append(String.format(".%nIt has %s symbols.", resultsMap.get("longestLine")));
			bw.newLine();

			bw.append(String.format("%nThis code written by %s, DOB - %s. Written on ", "Nazar Ivankiv",
					"26 January 1995") + " " + LocalDate.now());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
