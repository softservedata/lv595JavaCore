package com.softserve.edu.less10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
        System.out.print("Enter 1st string: ");
        str1 = br.readLine();
        System.out.print("Enter 2nd string: ");
        str2 = br.readLine();
        int position = str1.indexOf(str2);
        if (position < 0)
            System.out.println(str2 + " not in " + str1);
        else
            System.out.println("\""+str2 + "\" on " + position + " position in \"" + str1);
    }
}
