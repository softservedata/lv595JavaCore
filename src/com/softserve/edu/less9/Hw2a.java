package com.softserve.edu.less9;

import java.util.*;

public class Hw2a {
    public static void main(String[] args) {
        MapVas<String, String> personMap = new HashMapVas<>();
        personMap.put("Petenko","Olena");
        personMap.put("Romaniv","Orest");
        personMap.put("Ilkiv","Igor");
        personMap.put("Romaniv","Natalia");
        personMap.put("Petrenko","Maria");
        personMap.put("Kovalenko","Orest");
        personMap.put("Petrenko","Nazar");
        personMap.put("Ilkiv","Illia");
        personMap.put("Dmytriv","Olena");
        personMap.put("Ilkiv","Oresta");
        System.out.println("origin personMap is : " + personMap);
/*
        Set<String> firstNames = new HashSet<String>();
                firstNames = (HashSet<String>) personMap.values();
*/
//        Collections firstNames = (String) personMap.values();
/* int count =0;
        System.out.println("A list of names met less 2 times: ");
        for(String currentFirstName : personMap.values()){
            count = 0;
            for(Map.Entry<String, String> currentPerson : personMap.entrySet())
            {
                if (currentPerson.getValue().equals(currentFirstName))
                    count++;
            }
            if (count < 2)
                System.out.print(currentFirstName + ", ");
        }
*/    }
}
