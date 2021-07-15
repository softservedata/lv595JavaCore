package main.java.com.softserv.edu.less14maven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;






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