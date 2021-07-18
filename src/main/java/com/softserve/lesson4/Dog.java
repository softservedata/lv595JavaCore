package com.softserve.lesson4;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    private enum Breed {Taxa, Mops, Pitbull, Labrador, Senbernar, Doberman}

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && name.equals(dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog tax = new Dog("Jack", Breed.Taxa, 3);
        Dog mop = new Dog("Rex", Breed.Mops, 9);
        Dog dob = new Dog("Fur", Breed.Doberman, 6);
        System.out.println(tax);
        System.out.println(mop);
        System.out.println(dob);
        Dog maxAge = tax;
        if (maxAge.getAge() < mop.getAge())
            maxAge = mop;
        if (maxAge.getAge() < dob.getAge())
            maxAge = dob;
        System.out.println("The Oldest Dog is " + maxAge.name);
        if (tax.getName().equals(mop.getName()))
            System.out.println(tax.name + tax.breed + " has the same name as and " + mop.name + mop.breed);
        else if (tax.getName().equals(dob.getName()))
            System.out.println(tax.name + tax.breed + " has the same name as and " + dob.name + dob.breed);
        else if (mop.getName().equals(dob.getName()))
            System.out.println(mop.name + mop.breed + " has the same name as and " + dob.name + dob.breed);
        else
            System.out.println("No dogs have the same name ");
    }

}
