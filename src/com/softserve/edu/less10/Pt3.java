package com.softserve.edu.less10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pt3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("[A-Z]\\w{2,14}");
        Matcher m;
        String name;
        for(int i = 0; i<5; i++){
            System.out.print("Enter name : ");
            name = br.readLine();
            m = p.matcher(name);
            if (m.matches())
            System.out.println("valid name!!!");
            else
            System.out.println("Wrong name!!!");
        }

    }
}
