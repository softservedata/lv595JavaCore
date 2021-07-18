package com.softserve.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hm2 {

    public static char[] encrypt(String s, int n) {

        char[] enc = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            enc[i] = (char) ((int) (s.charAt(i)) + n);
        }
        System.out.println("Your encrypt word: ");
        return enc;
    }

    public static char[] decrypt(String s, int n) {

        char[] dec = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            dec[i] = (char) ((int) (s.charAt(i)) - n);
        }
        System.out.println("Your decrypt word: ");
        return dec;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        String t = "";
        int k = 0;
        int n = 0;
        System.out.println("Read word to encrypt");
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Read key to encrypt");
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Hm2.encrypt(s, n));
        System.out.println("Read word to decrypt");
        try {
            t = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Read key to decrypt");
        try {
            k = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Hm2.decrypt(t, k));
    }
}
