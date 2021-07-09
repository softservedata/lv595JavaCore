package com.softserve.edu06;

import java.util.Arrays;

public class Appl {

    public static void main(String[] args) {
        /*-
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int monthDays2[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
                30, 31 };
        int[] monthDays3;
        monthDays3 = new int[12];
        monthDays3[0] = 31;
        monthDays3[1] = 28;
        monthDays3[2] = 31;
        monthDays3[3] = 30;
        monthDays3[4] = 31;
        monthDays3[5] = 30;
        monthDays3[6] = 31;
        monthDays3[7] = 31;
        monthDays3[8] = 30;
        monthDays3[9] = 31;
        monthDays3[10] = 30;
        monthDays3[11] = 31;
        //
        System.out.println("monthDays.length = " + monthDays.length);
        System.out.println("monthDays = " + Arrays.toString(monthDays));
        System.out.println("arays.equals(monthDays, monthDays3) = "
                + Arrays.equals(monthDays, monthDays3));
        //
        System.out.print("Compare Arrays isEqual = ");
        boolean isEqual = true;
        for (int i = 0; isEqual && i < monthDays.length; i = i + 1) {
            isEqual = isEqual && monthDays[i] == monthDays3[i];
        }
        System.out.println(isEqual);
        //
        System.out.println("\n-1. for (int i=0; ...)");
        for (int i = 0; i < monthDays.length; i = i + 1) {
            // for (int i = monthDays.length - 1; i >= 0; i--) {
            System.out.print(monthDays[i] + "  ");
        }
        */
        /*-
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("\n0. for (int i=0; ...)");
        // for (int i = 0; i < monthDays.length; i = i + 2) {
        for (int i = 0; i < monthDays.length; i++) {
            if (i % 2 == 1) {
                System.out.print(monthDays[i] + "  ");
            }
        }
        //
        System.out.println("\n1. for (int i=0; ...)");
        for (int i = 0; i < monthDays.length; i++) {
            System.out.print(monthDays[i] + "  ");
        }
        //
        System.out.println("\n2. for each");
        for (int element : monthDays) {
            System.out.print(element + "  ");
        }
        //
        System.out.println("\n3. while");
        int k = 0;
        while (k < monthDays.length) {
            System.out.print(monthDays[k] + "  ");
            k++;
        }
        //
        System.out.println("\n4. do while");
        int n = 0;
        do {
            System.out.print(monthDays[n] + "  ");
            n++;
        } while (n < monthDays.length);
        //
        int m = 0;
        System.out.println("\n5. for (; ... ;)");
        for (; m < monthDays.length;) {
            System.out.print(monthDays[m] + "  ");
            m++;
        }
        //
        System.out.println("\n6. simple for(;;,);");
        for (int j = 0; j < monthDays.length; System.out.print(monthDays[j] + "  "), j++);
        */
        /*-
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("\n7. for (... ; ; ...)");
        for (int j = 0;; j++) {
            if (j >= monthDays.length / 2) {
                break;
            }
            System.out.print(monthDays[j] + "  ");
        }
        //
        System.out.println("\n8. for (... ; ; ...)");
        for (int j = 0; j < monthDays.length; j++) {
            if (j == monthDays.length / 2) {
                System.out.print("CE  ");
                continue;
            }
            System.out.print(monthDays[j] + "  ");
        }
        */
        // /*-
        System.out.println("\n9. irregular0");
        int[][] irregular0;
        irregular0 = new int[4][];
        irregular0[0] = new int[1];
        irregular0[1] = new int[3];
        irregular0[2] = new int[1];
        irregular0[3] = new int[2];
        irregular0[0][0] = 1;
        irregular0[1][0] = 2;
        irregular0[1][1] = 3;
        irregular0[1][2] = 4;
        irregular0[2][0] = 5;
        irregular0[3][0] = 6;
        irregular0[3][1] = 7;
        //
        for (int[] arr : irregular0) {
            for (int element : arr) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
        //
        System.out.println("\n10. irregular");
        int[][] irregular = { { 1 }, { 2, 3, 4 }, { 5 }, { 6, 7 } };
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.print(irregular[i][j] + "  ");
            }
            System.out.println();
        }
        //
        int k1 = 5;
        int k2 = k1++;
        System.out.println("\nk2 = " + k2);
        // */
    }
}
