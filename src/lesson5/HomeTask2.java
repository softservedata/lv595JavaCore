package lesson5;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integer numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int res = 0;
        boolean mas = true;
        for (int i = 0; mas && i < 10; i++) {
            if (arr[i] < 0) {
                mas = false;
                res = 1;
            } else {
                res += arr[i];
            }
        }
        for (int i = 0; !mas && i < arr.length; i++)
            res *= arr[i];
        System.out.println("Result = " + res);

    }
}
