package com.softserve.lesson7.Person;

public class Solution {
    public static void main(String[] args) {
        Person[] pers = {new Cleaner("Petro"),
                new Teachers("David"),
                new Student("Anna")
        };
        for (Person count : pers) {
            System.out.println(count.print());
            if (count instanceof Staff == true)
                System.out.println("My salary : " + ((Staff) count).salary());
        }


    }

}
