package lesson5;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        int[] jan = new int[31];
        int[] feb = new int[28];
        int[] mart = new int[31];
        int[] apr = new int[30];
        int[] may = new int[31];
        int[] jun = new int[30];
        int[] jul = new int[31];
        int[] august = new int[31];
        int[] sep = new int[30];
        int[] oct = new int[31];
        int[] nov = new int[30];
        int[] dec = new int[31];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month :");
        int x = scanner.nextInt();
        switch (x)
        {
            case (1):
                System.out.println(jan.length);
                break;
            case (2):
                System.out.println(feb.length);
                break;
            case(3):
                System.out.println(mart.length);
                break;
            case (4):
                System.out.println(apr.length);
                break;
            case (5):
                System.out.println(may.length);
                break;
            case (6):
                System.out.println(jun.length);
                break;
            case (7):
                System.out.println(jul.length);
                break;
            case (8):
                System.out.println(august.length);
                break;
            case(9):
                System.out.println(sep.length);
                break;
            case(10):
                System.out.println(oct.length);
                break;
            case (11):
                System.out.println(nov.length);
                break;
            case (12):
                System.out.println(dec.length);
                break;
        }
    }
 }
