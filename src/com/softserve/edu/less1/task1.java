package com.softserve.edu.less1;
/*
public class task1 {
}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) throws IOException {
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Input b: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + ((float) a / b));

        System.out.print("How are you?");
        String yourState = br.readLine();
        System.out.println("You are " + yourState);

/* System.out.println("How old are you?");

System.out.println("Hello " + name);
*/
    }
}