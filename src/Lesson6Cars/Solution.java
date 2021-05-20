package Lesson6Cars;

public class Solution {
    public static void main(String[] args) {
        Truck daf = new Truck("Daf_CF", 165.4, 2018);
        Sedan ford = new Sedan("Ford_Focus", 230.8, 2015);
        Truck man = new Truck("Man", 167.3, 2013);
        Sedan vw = new Sedan("VW_Passt", 215.8, 2017);
        Sedan mazda = new Sedan("Mazda_3", 190.1, 2013);
        Car[] cars = new Car[5];
        cars[0] = daf;
        cars[1] = ford;
        cars[2] = man;
        cars[3] = vw;
        cars[4] = mazda;
        for (Car i : cars) {
            System.out.println(i);
        }
    }
}