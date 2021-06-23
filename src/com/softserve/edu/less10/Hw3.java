package com.softserve.edu.less10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("\\$\\d+[.,]\\d{2}");
        Matcher m;
        StringBuilder name = new StringBuilder("$0.2");
        boolean criteria;
        do {
            System.out.println("Enter currency : ");
            name.delete(0,name.length());
            name.append(br.readLine());
//        name = "I am making this task long time";

            m = p.matcher(name.toString());
            if (criteria=m.matches())
                System.out.println("Correct input.");
            else
                System.out.println("Wrong input!!!");
        } while(criteria);
    }
}
