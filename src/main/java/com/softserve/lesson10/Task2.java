package com.softserve.lesson10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, surname, patronymic;
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter middle name: ");
        patronymic = scanner.nextLine();
        System.out.println("Surnames and initials: " + surname + " " + name.charAt(0)
                + ". " + patronymic.charAt(0) + '.');
        System.out.println("Name, middle name and last name: " + name + " "
                + patronymic + " " + surname);

    }
}
