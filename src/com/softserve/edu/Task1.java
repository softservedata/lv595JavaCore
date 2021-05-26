package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

        public static void main(String[] args) throws IOException {

            // task 1
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.print("input radius r = ");
            int r = Integer.parseInt(br.readLine());
            double p = 2 * 3.14 * r;
            double s = 3.14 * r * r;

            System.out.println("P = " + p);
            System.out.println("S = " + s);

            // task 2
            System.out.println("What is your name?");
            String name = br.readLine();
            System.out.println("Where are you live,(name)?");
            String address = br.readLine();
            System.out.println("Your name:" + name);
            System.out.println("Your address:" + address);

            // task 3
            System.out.println("input units per minute c1 =");
            int c1 = Integer.parseInt(br.readLine());
            System.out.println("input units per minute c2 =");
            int c2 = Integer.parseInt(br.readLine());
            System.out.println("input units per minute c3 =");
            int c3 = Integer.parseInt(br.readLine());
            System.out.println("input count of minutes t1 =");
            int t1 = Integer.parseInt(br.readLine());
            System.out.println("input count of minutes t2 =");
            int t2 = Integer.parseInt(br.readLine());
            System.out.println("input count of minutes t3 =");
            int t3 = Integer.parseInt(br.readLine());

            System.out.println("Count for 1 call: " + c1 * t1);
            System.out.println("Count for 2 call: " + c2 * t2);
            System.out.println("Count for 3 call: " + c3 * t3);
            System.out.println("Count for all calls: " + (c1 * t1 + c2 * t2  + c3 * t3));

            br.close();
        }
    }


