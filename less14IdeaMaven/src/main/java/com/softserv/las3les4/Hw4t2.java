package com.softserve.edu.las3les4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Objects;


enum Breed{
    TAX("tax"),
    DOG("dog"),
    PITBULL("pitbull"),
    BULLDOG("bulldog"),
    CHAOCHAO("chao-chao"),
    SPITZ("spitz");
    private final String breed;

    Breed(String kind){
        breed = kind;
    }

    public String getKind (){
        return breed;
    }

    private Breed nextBreed (){
        if (this == TAX) return DOG;
        if (this == DOG) return PITBULL;
        if (this == PITBULL) return BULLDOG;
        if (this == BULLDOG) return CHAOCHAO;
        if (this == CHAOCHAO) return SPITZ;
         return TAX;

    }
//@Override
 //   public Breed valueOf(String arg){}

}



class Dog{ // extends Breed{
    private String name;
//    private Breed breed;
/*
enum Breed{
    TAX("tax"),
    DOG("dog"),
    PITBULL("pitbull"),
    BULLDOG("bulldog"),
    CHAOCHAO("chao-chao"),
    SPITZ("spitz");
    private String kind;

    Breed(String kind){
        this.kind = kind;
    }

    public String getKind (){
        return this.kind;
    }
}
*/
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

    Dog(String name, Breed breed, int age) {
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

public class Hw4t2 {

        public static void main(String[] args) throws Exception {
        int maxAge;
        Dog dog1 = new Dog("Max", Breed.DOG, 2);
        Dog dog2 = new Dog("Max", Breed.SPITZ, 5);
        Dog dog3 = new Dog("Tuzik", Breed.BULLDOG, 4);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Dog maxAgeDog = dog1;
        if (maxAgeDog.getAge() < dog2.getAge())
            maxAgeDog = dog2;
        if (maxAgeDog.getAge() < dog3.getAge())
             maxAgeDog = dog3;
        System.out.println("The oldest dog is " + maxAgeDog);
//        /*
        System.out.println("The 1stdog is " + dog1);
        System.out.println("The 2nddog is " + dog2);
        System.out.println("The 3rddog is " + dog3);
/*        System.out.print("Breed for 1st dog? ");
        String tempBreed = br.readLine().toUpperCase();
        dog1.setBreed(Breed.valueOf(tempBreed));
        System.out.println("The 1stdog is " + dog1);

        */

        if (dog1.getName().equals(dog2.getName()))
            System.out.println(dog1 + " has same name as " + dog2);
        if (dog1.getName().equals(dog3.getName()))
            System.out.println(dog1 + " has same name as " + dog3);
        if (dog2.getName().equals(dog3.getName()))
            System.out.println(dog2 + " has same name as " + dog3);

    }
}