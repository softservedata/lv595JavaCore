package com.softserve.lesson6.Birds;

public class Chicken  extends NonFlyingBird{
    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
