package com.softserve.edu.myhashko.l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)". */

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("How are you? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mood = br.readLine();
        System.out.println("You are " + mood);

    }
}
