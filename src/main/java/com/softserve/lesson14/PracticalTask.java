package com.softserve.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask {
    public static void words() throws IOException {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        character = br.readLine();
        for (int i = 0; i < testWord.length(); i++) {
            if (testWord.substring(i, i + 1).equals(character)) {
                countCharacters++;
            }
        }
        System.out.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);

    }

    public static void main(String[] args) {
        try {
            PracticalTask.words();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
