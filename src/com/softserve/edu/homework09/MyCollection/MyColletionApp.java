package com.softserve.edu.homework09.MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class MyColletionApp {
	public static void main(String[] args) {
		List <Integer> myCollection = new ArrayList<>();
		for (int i=0;i<10;i++) {
			Random random =new Random();
			int numb = random.nextInt(40);
			System.out.println(numb);
			myCollection.add(numb);
		}
		System.out.println("myCollection: " + myCollection);
		
		List <Integer> myList = new ArrayList<> ();
		for (Integer current:myCollection) {
			if (current > 5) {
				myList.add(current);
			}
		}
		
		System.out.println("myList: " + myList);
		
		ListIterator <Integer> iter = myCollection.listIterator();
		while (iter.hasNext()) {
			if (iter.next()>20) {
				myCollection.remove(iter.next());
				System.out.printf("Removed %d from my Collection.\n", 10);
			}
				
			
			
		}
	}
}
