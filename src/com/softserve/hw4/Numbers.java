package com.softserve.hw4;

public class Numbers {
	//Task 1
	public void ifOdd(int a, int b, int c) {
		int[] num = { a, b, c };
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if ((num[i] % 2) != 0) {
				j++;

			}

		}
		System.out.print(j + " numbers from 3 are odd.\n");
	}

	//Task 2
	public void week(int a) {
		String[] en = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String[] ru = { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };
		String[] ua = { "Понеділок", "Вівторок", "Середа", "Четвер", "П’ятниця", "Субота", "Неділя" };
		System.out.print(ua[a - 1] + ", " + ru[a - 1] + ", " + en[a - 1] + "\n");
	}

	
}
