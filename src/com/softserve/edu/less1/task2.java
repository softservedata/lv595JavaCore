package com.softserve.edu.less1;
/*
public class task2 {
}
*/

//package softserv.javacore.less1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static void main(String[] args) throws IOException {
        float radius, pi = 3.14150f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input circle's radius: ");
        radius = Float.parseFloat(br.readLine());
        System.out.println("A circle's perimeter equal " + (2 * pi * radius) + ", a circle's are equal " + (pi * Math.pow(radius, pi)));

        System.out.print("What is your name? ");
        String yourName = br.readLine();
        System.out.print("Where you live, " + yourName + " ");
        String yourAdress = br.readLine();
        System.out.print(yourName + ", you live in " + yourAdress);

        System.out.print("Input c1: ");
        float c1 = Float.parseFloat(br.readLine());
        System.out.print("Input c2: ");
        float c2 = Float.parseFloat(br.readLine());
        System.out.print("Input c3: ");
        float c3 = Float.parseFloat(br.readLine());
        System.out.print("Input t1: ");
        float t1 = Float.parseFloat(br.readLine());
        System.out.print("Input t2: ");
        float t2 = Float.parseFloat(br.readLine());
        System.out.print("Input t3: ");
        float t3 = Float.parseFloat(br.readLine());
        System.out.println("1st talk's units = " + (c1 * t1));
        System.out.println("2nd talk's units = " + (c2 * t2));
        System.out.println("3rd talk's units = " + (c3 * t3));
        System.out.println("Total talk's units = " + (c1 * t1 + c2 * t2 + c3 * t3));




      /*      System.out.println("a / b = " + ((float) a / b));

      System.out.print("How are you?");
      String yourState = br.readLine();
      System.out.println("You are " + yourState);

/* System.out.println("How old are you?");

System.out.println("Hello " + name);
*/
    }
}