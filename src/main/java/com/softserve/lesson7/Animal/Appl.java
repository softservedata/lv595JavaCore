package com.softserve.lesson7.Animal;

public class Appl {
    public static void main(String[] args) {
        Animal[] animal = {new Cat("Murzik"),
                new Dog("Rex"),
                new Cat("Barsik"),
                new Dog("Hatilo")};
        for (Animal current : animal) {
            System.out.println(current.voice()+ " " + current.feed());

        }

    }


}
