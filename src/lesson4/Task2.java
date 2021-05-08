package lesson4;

//read 3 integer numbers and write max and min of them;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 3 числа : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > (Math.max(b, c))) {
            System.out.println("Найбільше число  " + a);
        } else if (b > (Math.max(a, c))) {
            System.out.println("Найбільше число  " + b);
        } else if (c > Math.max(a, b)) {
            System.out.println("Найбільше число  " + c);
        }
        if (a < Math.min(b, c)) {
            System.out.println("Найменше число " + a);
        }
        else if (b < Math.min(a,c)) {
            System.out.println("Найменше число " + b);
        }
        else if (c < Math.min(a,b)) {
            System.out.println("Найменше число " + c);
        }
    }
}

