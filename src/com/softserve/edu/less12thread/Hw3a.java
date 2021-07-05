package com.softserve.edu.less12thread;

public class Hw3a {
    public static void main(String[] args) {

        Object svitlofor = new Object();


        Message3 one = new Message3("Thread number one", 100, 10, svitlofor);
        Message3 two = new Message3("Thread number two", 50, 10, svitlofor);
        Message3 three = new Message3("Thread number three", 300, 10, svitlofor);


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
