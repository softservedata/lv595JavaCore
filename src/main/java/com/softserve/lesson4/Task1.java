package com.softserve.lesson4;
//read 3 float numbers and check: are they all belong to the range [-5,5]
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа : ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        if ((a >= - 5) && (a <= 5) ) {
            System.out.println("Число " + a + " входить в діапазон [-5 , 5] ");
        }
        else {
            System.out.println("Число " + a + " не входить в діапазон [-5 , 5] ");
        }
        if ((b >= - 5) && (b <= 5) ) {
            System.out.println("Число " + b + " входить в діапазон [-5 , 5] ");
        }
        else {
            System.out.println("Число " + b + " не входить в діапазон [-5 , 5] ");
        }
        if ((c >= - 5) && (c <= 5) ) {
            System.out.println("Число " + c + " входить в діапазон [-5 , 5] ");
        }
        else {
            System.out.println("Число " + c + " не входить в діапазон [-5 , 5] ");
        }
    }
}
