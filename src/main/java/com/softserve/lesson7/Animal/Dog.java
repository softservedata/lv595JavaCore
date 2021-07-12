package com.softserve.lesson7.Animal;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
       return name + " Woof";
    }

    @Override
    public String feed() {
      return name + " eats";

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
