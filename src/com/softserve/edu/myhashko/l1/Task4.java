package com.softserve.edu.myhashko.l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Define String variables name and address. Output question "What is your name?" Read the value name and output next question: “Where are you live, (name)?". Read address and write whole information. */

public class Task4 {
    public static void main(String[] args) throws IOException {
        String name;
        String address;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name? ");
        name = String.valueOf(br.readLine());

        System.out.println("Where do you live, " + name + "?");
        address = String.valueOf(br.readLine());

        System.out.println("Thanks for attention, " + name + ". " + address +" is an awesome city.");

    }
}
