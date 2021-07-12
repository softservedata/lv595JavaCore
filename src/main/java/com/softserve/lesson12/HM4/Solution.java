package com.softserve.lesson12.HM4;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String[] array = new String[4];
        String fileName = "file1.txt";
        String s = "";
        int max = 0;
        String maximum = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            for (int i = 0; i < array.length; i++) {
                if ((s = reader.readLine()) != null)
                    array[i] = s;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter file2 = null;
        BufferedWriter bw = null;
        try {
            file2 = new FileWriter("file2.txt");
            bw = new BufferedWriter(file2);
            bw.write("Number of lines in file1.txt is : " + array.length);
            bw.newLine();
            for (int i = 0; i < array.length; i++) {
                if (array[i].length() > max){
                    max = array[i].length();
                    maximum = array[i];
                }

            }
            bw.write("the longest line in file1.txt. is " + maximum);
            bw.newLine();
            bw.write(array[1]);
            bw.newLine();
            System.out.println("File2.txt write ");
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
