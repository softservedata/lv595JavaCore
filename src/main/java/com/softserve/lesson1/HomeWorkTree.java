package com.softserve.lesson1;

        /*Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks continued t1, t2 and t3 minutes.
        How much computer will count for each call separately and all talk together? Input all source data from console, make calculations and output to the screen.
*/

import java.util.Scanner;

public class HomeWorkTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть тариф дзвінка в Угорщину : ");
        double c1 = scan.nextDouble();
        System.out.println("Введіть тривалість дзвінка в Угорщину : ");
        int t1 = scan.nextInt();
        System.out.println("Введіть тариф дзвінка в Німеччину : ");
        double c2 = scan.nextDouble();
        System.out.println("Введіть тривалість дзвіка в Німеччину : ");
        int t2 = scan.nextInt();
        System.out.println("Введіть тариф дзвінка в Канаду : ");
        double c3 = scan.nextDouble();
        System.out.println("Введіть тривалість дзвінка в Канаду : ");
        int t3 = scan.nextInt();
        System.out.println("Вартість дзвінка в Угорщину дорівнює : " + (c1 + t1));
        System.out.println("Вартість Німеччину дорівнює : " + (c2 + t2));
        System.out.println("Вартість дзвінка в Канаду дорівнює : " + (c3 + t3));
        System.out.println("Загальна вартість всіх дзвінків дорівнює : " + ((c1 + t1) + (c2 + t2) + (c3 + t3) ) );
    }
}
