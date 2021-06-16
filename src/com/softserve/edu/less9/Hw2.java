package com.softserve.edu.less9;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hw2 {
    public static void main(String[] args) throws IOException {
        MapVas<String, String> personMap = new HashMapVas <>();
        personMap.put("LN1","Olena");
        personMap.put("LN2","Orest");
        personMap.put("LN3","Igor");
        personMap.put("LN4","Natalia");
        personMap.put("LN5","Maria");
        personMap.put("LN6","Orest");
        personMap.put("LN7","Nazar");
        personMap.put("LN8","Illia");
        personMap.put("LN9","Olena");
        personMap.put("LN10","Oresta");
        System.out.println("origin personMap is : " + personMap);
/*
        Set<String> firstNames = new HashSet<String>();
                firstNames = (HashSet<String>) personMap.values();
*/
//        Collections firstNames = (String) personMap.values();
 int count =0;
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
//        personMap.remove("ll", "EE")
        System.out.print("\nNamed persons to remove? : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String removedName = br.readLine();
        while (personMap.containsValue(removedName))
            personMap.remove(personMap.getKey(removedName));
        System.out.println("List cleared of " + removedName + " : " + personMap);

    }
}

