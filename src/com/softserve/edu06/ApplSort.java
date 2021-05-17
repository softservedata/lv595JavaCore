package com.softserve.edu06;

import java.util.Arrays;

public class ApplSort {
    public static void main(String[] args) {
        int[] arr = { 2, -3, 7, -4, 8, 1, 4 };
        // int[] arr = { 4, 3, 2, 1 };
        // int[] arr = { 1, 2, 3, 4 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        //
        /*-
        boolean isSorted = true;
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) { // i= 0, 1, 2
            isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.print(".");
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        */
        //
        //Arrays.sort(arr);
        System.out.println("Search -4: " + Arrays.binarySearch(arr, -4));
        Arrays.sort(arr, 1, 5);
        //
        System.out.println("\nSorted Array: " + Arrays.toString(arr));
    }
}
