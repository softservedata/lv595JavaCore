package com.softserve.edu.less5;


import java.util.Arrays;

public class Practic1 {

    public static void main(String[] args) {
        int[] massyv = {1, -3, 5, -7, 9, -8, 6, -4, 2, 0};
        int biggest = massyv[0], sumpositive =0, amountnegative = 0, amountpositive = 0;
        System.out.println(Arrays.toString(massyv));
        for (int element : massyv) {
            if (element > biggest) biggest = element;
            if (element >= 0) {
                amountpositive++;
                sumpositive += element;
            } else
                amountnegative++;
        }
        System.out.println("The biggest element equal " + biggest);
        System.out.println("A sum of positive equal " + sumpositive);
        System.out.println("The amount negative/positive equal " + amountnegative +
                " / " + amountpositive);
        System.out.println(Arrays.toString(massyv));
//        System.out.println("The biggest element equal " + biggest1);
    }

}
