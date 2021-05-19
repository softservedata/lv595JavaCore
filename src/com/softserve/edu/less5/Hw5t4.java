package com.softserve.edu.less5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hw5t4 {

    public static void main(String[] args) throws Exception{
        Car[] cars = {new Car(CarType.sedan, 1999, 2.6),
        new Car( CarType.allroad, 2009, 3.0),
        new Car(CarType.hatchback, 2005, 1.9)}; //, 30, 31};
        Car tmpCar;
        int searchYearProductio;
        int splitPosithion;
        boolean condition = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Cars present: " + Arrays.toString(cars));
        for (Car car : cars)
            System.out.println(car);
        System.out.print("Year of production? : ");
        searchYearProductio = Integer.parseInt(br.readLine());

        for (Car car : cars)
            if (car.getYearProduction() == searchYearProductio)
                System.out.println(car);

//        tmpCar = cars[0];
        for (int i = 0; i < cars.length; i++)
            for (int j = i +1; j < cars.length; j++)
                if (cars[i].getYearProduction() > cars[j].getYearProduction()) {
                    tmpCar = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmpCar;
                }

        System.out.println("\nCars ordered: ");
        for (Car car : cars)
                System.out.println(car);

//        System.out.print("Cars ordered: " + Arrays.toString(cars));
    }

}

enum CarType {
    sedan,
    hatchback,
    coupe,
    allroad;
}

class Car{
    private CarType type;
    private int yearProduction;
    private double engineCapacity;


    public Car(CarType type, int yearProductio, double engineCapacity) {
        this.type = type;
        this.yearProduction = yearProductio;
        this.engineCapacity = engineCapacity;
    }

    public CarType getType() {
        return type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", yearProduction=" + yearProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
