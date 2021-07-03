package com.softserve.edu.less12thread;

public class Hw3a {
    public static void main(String[] args) {

        Object svitlofor = new Object();


        Message3 one = new Message3("Thread number one", 1000l, 1, svitlofor);
        Message3 two = new Message3("Thread number two", 1000l, 3, svitlofor);
        Message3 three = new Message3("Thread number three", 1000l, 5, svitlofor);


//        two.toJoin(one);
//        three.toJoin(two);
//        two.run();
        three.setMaster(two);
        two.setMaster(one);
        three.start();
        two.start();
        one.start();
//        two.setMaster(one);
//        svitlofor.notify();
/*        try {
            three.join();
            two.join();
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

    }
}
