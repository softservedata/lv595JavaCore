package com.softserve.lesson8.CarB;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        Car honda = Car.getBuilder()
                .addModel("Honda Civic")
                .addAirConditioning(true)
                .addColor("Black")
                .addDateOfProduction(LocalDate.of(1998,8,14))
                .addPassengerCapacity(5)
                .addEngineCapacity(2.8)
                .build();
        System.out.println(honda);
    }
}
