package com.softserve.edu.homework09.MyCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyColletionApp {
	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<>();
		for (int i=0;i<10;i++) {
			Random random =new Random();
			int numb = random.nextInt(40);
			System.out.print(numb + ", ");
			myCollection.add(numb);
		}
		System.out.println("\nmyCollection: " + myCollection);
		
		List <Integer> myList = new ArrayList<> ();
		for (Integer current:myCollection) {
			if (current > 5) {
				myList.add(current);
			}
		}
		
		System.out.println("myList: " + myList);
		
		Iterator <Integer> iter = myCollection.iterator();
		while (iter.hasNext()) {
			Integer current = (Integer) iter.next();
			System.out.println("Current number: " + current);
			if (current>20) {
				iter.remove();
				System.out.printf("Removed %d from my Collection.\n", current);
			}
		}
		
		List<Integer> myLinkedList = new LinkedList<>();
		for (int i=0;i<10;i++) {
			Random random =new Random();
			int numb = random.nextInt(40);
			System.out.print(numb + ", ");
			myLinkedList.add(numb);
		}
		System.out.println("\nmyLinkedList: " + myLinkedList);
		
		
		myLinkedList.add(2, 1);
		myLinkedList.add(8, -3);
		myLinkedList.add(5, -4);
		System.out.println("\nPrinting myLinkedList:");
		for (int i=0;i<myLinkedList.size();i++) {
			System.out.printf("Position - %2d, value of ellement - %2d.\n", i, myLinkedList.get(i));
			
		}
		
		Collections.sort(myCollection);
		System.out.println("Sorted MyCollection: " + myCollection);
		Collections.sort(myLinkedList);
		System.out.println("Sorted myLinkedList: " + myLinkedList);
		Collections.sort(myList);
		System.out.println("Sorted MyList: " + myList);
		
	}
}
