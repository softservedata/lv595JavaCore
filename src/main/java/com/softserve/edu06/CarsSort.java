package com.softserve.edu06;

import java.util.Arrays;

class Car {
    private String type;
    private int year;

    public Car(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\nCar [type=" + type
                + ", year=" + year
                + "]";
    }

}

public class CarsSort {
    
    public static void mySort(Car[] arr) {
        boolean isSorted = true;
        Car tmp;
        for (int i = 0; i < arr.length - 1; i++) { // i= 0, 1, 2
            isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.print(".");
                if (arr[j].getYear() > arr[j + 1].getYear()) {
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
    }
    
    public static void main(String[] args) {
        Car[] cars = {new Car("bmw", 2011),
                new Car("mercedes", 2010),
                new Car("vw", 2014),
                new Car("hundai", 2017),
                new Car("kia", 2013),
                };
        System.out.println("Original Array: " + Arrays.toString(cars));
        //
        //Arrays.sort(cars);
        mySort(cars);
        //
        System.out.println("\nSorted Array: " + Arrays.toString(cars));
    }
}
