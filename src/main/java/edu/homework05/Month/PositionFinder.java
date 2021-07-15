package edu.homework05.Month;

public class PositionFinder {
	public static void main(String[] args) {
		int[] numbers = { -10, 4, -2, 15, -6 };

		int posCounter = 0;
		int posMin = 0;
		int min = numbers[posMin];
		int checker = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= 0) {
				posCounter++;
			}
			if (numbers[i] < min) {
				posMin = i;
			}
			if (posCounter == 2 && checker == 0) {
				System.out.println(
						"Second positiv number is at " + (i + 1) + " position, it's index in Array is - " + i + ".");
				checker++;
			}
		}
		System.out.println("Minimun nuber: " + min + ". It's position: " + (posMin + 1) + ".");
	}

}
