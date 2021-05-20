package com.softserve.edu.less5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hw5t3 {

    public static void main(String[] args) {

    int[] masyv = {3, -5, -2, 4, 6};
    int minimum = 0, position = 0, i;

    for (i =0; minimum < 2 && i < masyv.length; i++){
        position = i;
        if (masyv[i] >= 0) {
            minimum++;
        }
    }
    System.out.println("Second positive is " + position);

    minimum = masyv[0];
    position = 0;
    for (i = 1; i < masyv.length; i++ )
        if (minimum > masyv[i]) {
            minimum = masyv[i];
            position = i;
        }
    System.out.println("Minimum is " + minimum + " and its position " + position);

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter month number");
        number = Integer.parseInt(br.readLine());
*/

   }
}
