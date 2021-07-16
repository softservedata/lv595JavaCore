package com.softserve.edu.less9;

import com.softserve.edu.less2.Person;
import com.softserve.edu.less8.Hworks.FullName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import com.softserve.edu.less9.MapVas;
import com.softserve.edu.less9.HashMapVas;


public class Hw2a {
    public static void main(String[] args) throws IOException {
        MapVas<Integer, FullName> personMap = new HashMapVas<>();
        personMap.put(1, new FullName("Olena","Petenko"));
        personMap.put(2, new FullName("Orest","Romaniv"));
        personMap.put(3, new FullName( "Igor","Ilkiv"));
        personMap.put(4, new FullName("Natalia","Romaniv"));
        personMap.put(5, new FullName("Maria","Petrenko"));
        personMap.put(6, new FullName("Orest","Kovalenko"));
        personMap.put(7, new FullName("Nazar","Petrenko"));
        personMap.put(8, new FullName("Illia","Ilkiv"));
        personMap.put(9, new FullName("Olena","Dmytriv"));
        personMap.put(10, new FullName("Oresta","Ilkiv"));
//        System.out.println("origin personMap is : " + personMap);
        for(Map.Entry<Integer, FullName> currentPerson : personMap.entrySet())
            System.out.println(currentPerson);
          int count =0;
        System.out.println("A list of names met less 2 times: ");
        for(FullName currentFullName : personMap.values()){
            count = 0;
            for(Map.Entry<Integer, FullName> currentPerson : personMap.entrySet())
            {
                if (currentPerson.getValue().getFirstName().equals(currentFullName.getFirstName()))
                    count++;
            }
            if (count < 2)
                System.out.print(currentFullName.getFirstName() + ", ");
        }
        System.out.print("\nNamed persons to remove? : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String removedName = br.readLine();
        Iterator personIter = personMap.entrySet().iterator();
Map.Entry<Integer, FullName> personEntry;
count = 0;
        while(personIter.hasNext()) {
            personEntry = (Map.Entry) personIter.next();
            if (personEntry.getValue().getFirstName().equals(removedName)){
                count++;
                personIter.remove();
            }
        }
        /*        for(Map.Entry<Integer, FullName> currentPerson : personMap.entrySet())
        {
            if (currentPerson.getValue().getFirstName().equals(removedName)))
                currentPerson.;
        }

        while (personMap.containsValue(removedName))
            personMap.remove(personMap.getKey(removedName));
*/      if ( count != 0) {
            System.out.println("List cleared of " + removedName + " : ");
            for (Map.Entry<Integer, FullName> currentPerson : personMap.entrySet())
                System.out.println(currentPerson);
        } else
            System.out.println(removedName + " is absent in list!!!");
    }
}
