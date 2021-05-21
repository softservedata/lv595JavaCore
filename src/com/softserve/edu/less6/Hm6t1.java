package com.softserve.edu.less6;

public class Hm6t1 {
    public static void main(String[] args) {
        Bird[] birds = {new Penguin(), new Swallow(), new Chicken(), new Eagle()};
    for (Bird bird : birds)
        bird.fly();

    }
}

class Eagle extends FlyingBird{}

class Swallow extends FlyingBird{}

class Penguin extends NonFlyingBird{}

class Chicken extends NonFlyingBird{}

class NonFlyingBird extends Bird{
    @Override
    boolean fly() {
        System.out.println(this.getClass() + " not flies");
        return false;
    }
}


class FlyingBird extends Bird{
    @Override
    boolean fly() {
        System.out.println(this.getClass() + " flies");
        return true;
    }
}

abstract class Bird{
    public boolean feathers;
    public boolean layEggs;
    abstract  boolean fly();


}