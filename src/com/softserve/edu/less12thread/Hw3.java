package com.softserve.edu.less12thread;

public class Hw3 {
public static Object svitlofor = new Object();

public static void main(String[] args) {


        Message2 one = new Message2("Thread number one", 1, 1);
        Message2 two = new Message2("Thread number two", 1, 3);
        Message2 three = new Message2("Thread number three", 1, 5);
        two.toJoin(one);
        three.toJoin(two);
        synchronized (svitlofor) {
            three.start();
//        two.run();
            two.start();
            one.start();
        }
svitlofor.notify();

    }
}
