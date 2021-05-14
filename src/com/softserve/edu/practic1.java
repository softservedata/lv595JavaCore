package com.softserve.edu;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
public class Employee {

    private String name;
    private double rate, hours;
    private static double totalSum;

    public boolean setName (String arg) {
        if (arg.isEmpty()) return false;
        name = arg;
        return true;
    }
*/

public class practic1 {

   public static void main(String[] args)  throws Exception{
       int num1, num2, num3, oddNumbers = 0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter 3 integer numbers : ");
       num1 = Integer.parseInt(br.readLine());
       num2 = Integer.parseInt(br.readLine());
       num3 = Integer.parseInt(br.readLine());

       if ((num1 %= 2) != 0) {
           oddNumbers++;
       }
       System.out.println("OddNumbers is " + oddNumbers);

//       (num2 %= 2) != 0 ? oddNumbers++ : 1;
       oddNumbers = (num2 %= 2) != 0 ? oddNumbers+1 : oddNumbers;
       System.out.println("OddNumbers is " + oddNumbers);

       switch (num3 %= 2) {
           case 0:
               break;
           case 1:
               oddNumbers++;
       }

           System.out.println("OddNumbers is " + oddNumbers);
   }


}
