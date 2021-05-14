package com.softserve.edu.las3les4;

import java.io.BufferedReader;
import java.io.InputStreamReader;


enum Breed{
    TAX("tax"),
    DOG("dog"),
    PITBULL("pitbull"),
    BULLDOG("bulldog"),
    CHAOCHAO("chao-chao"),
    SPITZ("spitz");
    private final String breed;

    Breed(String kind){
        this.breed = kind;
    }

    public String getKind (){
        return this.breed;
    }
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
        return this.name;
    }

    Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.mark = false;
    }

    public int getAge (){
        return this.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    /*
    private Dog nextHTTPError() {
        if (this == Dog.E400)return E401;
        if (this == Dog.E401)return E402;
        if (this == Dog.E402)return E403;
        if (this == Dog.E403)return E404;
        if (this == Dog.E404)return E405;
        if (this == Dog.E405)return E406;
        if (this == Dog.E406)return E407;
        if (this == Dog.E407)return E408;
        if (this == Dog.E408)return E409;
        if (this == Dog.E409)return E410;
        return E400;
    }
*/
    /*
    public Dog knownHTTPError (int code){
//        this = HTTPError.E400;
        Dog result = Dog.E400;
//        System.out.println(code);
        do {
//             System.out.println(result);
            if (result.code == code) {
//                System.out.println("Error known");
                result.mark = true;
                return result;
            }
            result = result.nextHTTPError();
        } while (result != Dog.E400);
        return result;
    }
*/
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

        if (dog1.getName().equals(dog2.getName()))
            System.out.println(dog1 + " has same name as " + dog2);
        if (dog1.getName().equals(dog3.getName()))
            System.out.println(dog1 + " has same name as " + dog3);
        if (dog2.getName().equals(dog3.getName()))
            System.out.println(dog2 + " has same name as " + dog3);

/*        errorCode = Integer.parseInt(br.readLine());

        Dog dog = Dog.E400;
        dog = dog.knownHTTPError(errorCode);
        if (dog.isMarked())
            System.out.println("Error " + dog.getDescription());
        else
            System.out.println("Unknown Error!");
    }

 */
    }
}