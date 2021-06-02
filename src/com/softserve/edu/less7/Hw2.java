package com.softserve.edu.less7;

public class Hw2 {
    public static void main(String[] args) {

    }
}


//----------------------------------------------
class Car extends GroundVehicle{
    private String model;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {

    }
}



//----------------------------------------------
class Motocycle extends GroundVehicle{
    private int maxSpeed;

    public Motocycle() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {

    }
}



//-----------------------------------------------
class Bus extends GroundVehicle{
    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {

    }
}




//------------------------------------------------
class Helicopter extends FlyingVehicle{
    private int weigth;
    private int maxHeigth;

    public Helicopter() {
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}


//-----------------------------------------------
class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane() {
    }


    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}


//-----------------------------------------------
class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {

    }
}



//------------------------------------------------
class Liner extends WaterVehicle{
    private int floors;

    public Liner() {
    }

    @Override
    void isSailing(){}

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}



//-------------------------------------------------
abstract class GroundVehicle extends Passengers implements Vehicle{


    public GroundVehicle() {
    }

    abstract void drive();
}




//---------------------------------------------------
abstract class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle() {
    }

    abstract void fly();
    abstract void land();
}


//----------------------------------------------------------
abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle() {
    }

    abstract void isSailing();
}

//-------------------------------------------------------------
interface Vehicle{

}

//-------------------------------------------------------------
abstract class Passengers {
    private int passengers;

    public Passengers(){}

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}