package com.softserve.edu.less7;

public class Pt1 {
    public static void main(String[] args) {
    Animal[] homeZoo = { new Dog("Tuzik"),
    new Cat("Murka"),
    new Cat("Max"),
    new Dog("Zhu4ka")};

    for (Animal pet : homeZoo){
        pet.voice();
        pet.feed();
    }
    }
}

class Dog implements Animal{
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void voice(){
        System.out.println(name + " Hav-Hav!!!");
    }
    public void feed(){
        System.out.println(name + " feed cats.");
    }
}

class Cat implements Animal{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    private String name;
    public void voice(){
        System.out.println(name + " miav-miav!!!");
    }
    public void feed(){
        System.out.println(name + " feed mouses");
    }

}

interface Animal{
    void voice();
    void feed();

}