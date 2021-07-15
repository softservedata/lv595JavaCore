package edu.homework10.StringsPractical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringApp {

	public static void main(String[] args) {
		String text = "It's my life, and it's now or never";
		String subText = "now or never";

		System.out.println(text.contains(subText));

		;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter Name:");
			String name = br.readLine();
			System.out.println("Enter Surname:");
			String surname = br.readLine();
			System.out.println("Enter Patronymic:");
			String patronymic = br.readLine();

			System.out.printf("%25s %S %S. %S.%n", "Surname and initials:", surname, name.substring(0, 1),
					patronymic.substring(0, 1));
			System.out.printf("%25s %S%n", "Name:", name);
			System.out.printf("%25s %S %S %S.%n", "Full name:", name, patronymic, surname);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("You fucked up!!!");
			e.printStackTrace();
		}

	}

}
