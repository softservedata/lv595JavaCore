package com.softserve.edu.less8.Hworks;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Pt1 {
    public static void main(String[] args) {
     Car car = (Car) Car.getCar().setModel("Tour")
             .setDateOfProduce(LocalDate.now())
             .setEngineCapacity(1.6)
             .setColor("snowWhite")
             .setPassangerCapacity(5)
             .setAirCondioning(true)
             .build();
        System.out.println(car);
        Car carDef = (Car) Car.getCarDef().build();
        System.out.println(carDef);
    }
}

class Car {
    private String model;
    private LocalDate dateOfProduce;
    private double engineCapacity;
    private String color;
    private int passangerCapacity;
    private boolean isAirCondioning;

    private void CarDef(){
        model = "OEM";
        dateOfProduce = LocalDate.now();
        engineCapacity = 1.2;
        color = "grey";
        passangerCapacity = 4;
        isAirCondioning = false;
    }

    private Car(){
        model = "";
        dateOfProduce = LocalDate.now();
        engineCapacity = 0;
        color = "";
        passangerCapacity = 0;
        isAirCondioning = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dateOfProduce=" + dateOfProduce +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passangerCapacity=" + passangerCapacity +
                ", isAirCondioning=" + isAirCondioning +
                '}';
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setDateOfProduce(LocalDate dateOfProduce) {
        this.dateOfProduce = dateOfProduce;
    }

    private void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    private void setAirCondioning(boolean airCondioning) {
        isAirCondioning = airCondioning;
    }

    public static CarBuilder getCar(){
           Car car = new Car();
           return car.new CarBuilder();
    }

    public static CarBuilder getCarDef(){
        Car car = new Car();
        car.CarDef();
        return car.new CarBuilder();
    }

    //////////////////////////////////////

    public class CarBuilder{
        private CarBuilder(){}

        public CarBuilder setModel(String model) {
            Car.this.setModel(model);
            return this;
        }

        public CarBuilder setDateOfProduce(LocalDate dateOfProduce) {
            Car.this.setDateOfProduce(dateOfProduce);
            return this;
        }

        public CarBuilder setEngineCapacity(double engineCapacity) {
            Car.this.setEngineCapacity(engineCapacity);
            return this;
        }

        public CarBuilder setColor(String color) {
            Car.this.setColor(color);
            return this;
        }

        public CarBuilder setPassangerCapacity(int passangerCapacity) {
            Car.this.setPassangerCapacity(passangerCapacity);
            return this;
        }

        public CarBuilder setAirCondioning(boolean airCondioning) {
            isAirCondioning = airCondioning;
            return this;
        }

        public Object build(){
            Boolean result = false;
            return result;
//            return (Car) Car.this;
        }
    }
}