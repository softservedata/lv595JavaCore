package com.softserve.lesson7.Animal;

public class Cat implements Animal {
    private String Name;

    public Cat(String Name) {
        this.Name = Name;
    }
    @Override
    public String voice() {
       return Name + " meow";
    }

    @Override
    public String feed() {
       return Name + " eat";

    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
