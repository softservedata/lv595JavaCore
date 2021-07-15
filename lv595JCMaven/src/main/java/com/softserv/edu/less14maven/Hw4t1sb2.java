package main.java.com.softserv.edu.less14maven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hw4t1sb2 {

    public static void main(String[] args) throws Exception {
        int num1, num2, num3, min, max;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IntFind intFind = new IntFind();
        System.out.println("Enter 3 int : ");
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());
        num3 = Integer.parseInt(br.readLine());
        min = intFind.min(new int[]{num1, num2, num3});
        max = intFind.max(new int[]{num1, num2, num3});

/*
        if (num2 <= min)
            min = num2;
        else if (num2 >= max)
            max = num2;

        if (num3 <= min)
            min = num3;
        else if (num3 >= max)
            max = num3;
*/
        System.out.println("minimum of lastones is " + min + ", and maximum is " + max);

    }
}

