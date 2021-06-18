package com.softserve.edu.less10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String surname, name, patronymic;
        System.out.print("Enter surname: ");
        surname = br.readLine();
        System.out.print("Enter name: ");
        name = br.readLine();
        System.out.print("Enter middle name: ");
        patronymic = br.readLine();
        System.out.println("surnames and initials: " + surname + " " + name.charAt(0)
        + ". " + patronymic.charAt(0) + '.');
        System.out.println("name, middle name and last name: " + name + " "
                + patronymic + ' ' + surname);

    }
}
