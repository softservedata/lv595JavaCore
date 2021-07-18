package com.softserve.lesson1;

//Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you?");
        String ques = reader.readLine();
        System.out.println("You are " + ques);
        reader.close();
    }
}
