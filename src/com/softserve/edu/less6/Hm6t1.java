package com.softserve.edu.less6;

public class Hm6t1 {
    public static void main(String[] args) {
        Bird[] birds = {new Penguin(), new Swallow(), new Chicken(), new Eagle()};
    for (Bird bird : birds) {
        System.out.print(bird);
        bird.fly();
        }
    }
}

class Eagle extends FlyingBird{
    Eagle(){
        feathers = true;
        layEggs = true;
    }
}

class Swallow extends FlyingBird{
    Swallow(){
        feathers = true;
        layEggs = true;
    }
}

class Penguin extends NonFlyingBird{
    Penguin(){
        feathers = false;
        layEggs = true;
    }
}

class Chicken extends NonFlyingBird{
    Chicken(){
            feathers = true;
            layEggs = true;
        }

}

class NonFlyingBird extends Bird{
    @Override
    boolean fly() {
        System.out.println(  " not flies");
        return false;
    }
}


class FlyingBird extends Bird{
    @Override
    boolean fly() {
        System.out.println( " flies");
        return true;
    }
}

abstract class Bird{
    public boolean feathers;
    public boolean layEggs;
    abstract  boolean fly();


    @Override
    public String toString() {
        if (feathers && layEggs)
           return this.getClass() + " feathers, layEggs";
        if (feathers && !layEggs)
            return this.getClass() + " feathers, no layEggs";
        if (!feathers && layEggs)
            return this.getClass() + " no feathers, layEggs";

            return this.getClass() + " no feathers, no layEggs";
    }
}