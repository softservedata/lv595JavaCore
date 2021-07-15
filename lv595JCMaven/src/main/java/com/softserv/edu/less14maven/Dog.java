package main.java.com.softserv.edu.less14maven;

import java.util.Objects;

public class Dog{ // extends Breed{
    private String name;
    private Breed breed;
    private int age;
    private boolean mark;
/*
    public boolean isMarked (){
        return this.mark;
    }
*/

    public String getName (){
        return name;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.mark = false;
    }

    public int getAge (){
        return age;
    }

    public void setBreed(Breed breed){
        this.breed = breed;
    }

    public boolean sameName(Dog dog) {
        return this.name.equals(dog.name) ? true : false;
    }

    public Dog oldest (Dog dog) {
        return this.age > dog.age ? this : dog;
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
                ", breed=" + breed +
                " (" + breed.getKind() +
                "), age=" + age +
                '}';
    }

}