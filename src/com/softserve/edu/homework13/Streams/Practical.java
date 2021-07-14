package com.softserve.edu.homework13.Streams;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class Practical {
	
	private void sortUsingJava8(List<String> names){ 
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2)); 
		}

	
	public static void main(String[] args) {

//		Practical task 1
		System.out.println("\n\tPrinting Practical 1\n");
		Random random1 = new Random();
		random1.ints().limit(20).forEach(System.out::println);

//		Practical task 2
		System.out.println("\n\tPrinting Practical 2\n");
		Random random2 = new Random();
		random2.ints().limit(30).sorted().boxed().forEach(System.out::println);
		
//		Practical task 3
		System.out.println("\n\tPrinting Practical 3\n");
		List<Integer> numbers = Arrays.asList(12, 343, 45452, 2, 5325, 6234, 12, 1231, -24342, -3235235, 345354354);
		IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest number: " + stats.getMax());
		System.out.println("Lowest number: " + stats.getMin());
		System.out.println("Average of all numbers: " + stats.getAverage());
		System.out.println("Count of numbers: " + stats.getCount());
		System.out.println("Sum of all numbers: " + stats.getSum());
		
		
//		Practical task 4
		System.out.println("\n\tPrinting Practical 4\n");
		LocalDate dateNow = LocalDate.now();
		System.out.println("Day of the week: " + dateNow.getDayOfWeek());
		
//		Practical task 5
		System.out.println("\n\tPrinting Practical 5\n");
		LocalDate now = LocalDate.now();
		LocalDate lastMonday = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));
		LocalDate firstMonday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("Date of first Monday: " + firstMonday);
		System.out.println("Date of last Monday: " + lastMonday);
		
		
//		Practical task 6
		System.out.println("\n\tPrinting Practical 6\n");
		List <String> names = Arrays.asList("Nazar","Andy","Mike","Taras","Paul","Martin","Ivan","Oleg");
		System.out.println("\n\tUnsorted Strings:\n");
		names.stream().forEach(System.out::println);
		
		
		System.out.println("\n\tSorted Strings:\n");
		new Practical().sortUsingJava8(names);
		names.stream().forEach(System.out::println);
		
	}

}
