package com.softserve.lesson12.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("./MyText.txt"))) {
            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException!!!");
            e.printStackTrace();
        }
        for (String se:
             list) {
            if (se.toLowerCase().contains("war"))
                System.out.println(se);
        }
        String max = list.get(0);

        for (String se:
             list) {
            if (se.length() > max.length())
                max = se;
            System.out.println(max);
        }

    }

}
