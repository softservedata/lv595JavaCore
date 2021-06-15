package com.softserve.edu.less9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/*
interface MapVas<K,V> extends Map<K,V>{
    abstract public K getKey(String value);

}

class HashMapVas<K,V> extends HashMap<K,V> implements MapVas<K,V>{
    @Override
    public K getKey (String value){
        for (Map.Entry<K, V> current : this.entrySet())
            if (current.getValue().equals(value))
                return current.getKey();
        return null;
    }

    public HashMapVas(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public HashMapVas(int initialCapacity) {
        super(initialCapacity);
    }

    public HashMapVas() {
    }

    public HashMapVas(Map m) {
        super(m);
    }
}
*/
public class Pt2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MapVas<Integer, String> employeeMap = new HashMapVas<Integer, String>(){
             public Integer getKey (String value){
                for (Map.Entry<Integer, String> current : this.entrySet())
                    if (current.getValue().equals(value))
                        return current.getKey();
            return null;
            }
        };
   /*         @Override
            public String toString(){
                Map.Entry<Integer, String> current = (Map.Entry) this.EntrySet();
                return "\n\t" + current.getKey() + " -> " + ((Map.Entry) this).getValue().toString();
            }
        };
*/        employeeMap.put(2, "Danylo");
        employeeMap.put(5, "Dana");
        employeeMap.put(9, "Oxana");
        employeeMap.put(4, "Vasyl");
        employeeMap.put(1, "Anna");
        employeeMap.put(8, "Katya");
        employeeMap.put(7, "Volodja");
        employeeMap.put(6, "Vika");
        employeeMap.put(3, "Andrij");
        employeeMap.put(0, "Tanja");
        System.out.println("Origin map: " + employeeMap);

        System.out.print("Enter wanted ID: ");
        Integer wantedId = Integer.parseInt(br.readLine());
        if (employeeMap.containsKey(wantedId))
            System.out.println("ID = " + wantedId + ", entry = " + employeeMap.get(wantedId));
        else
            System.out.println("Wrong ID!!");

        System.out.print("Enter wanted Name: ");
        String wantedName = br.readLine();
        if (employeeMap.containsValue(wantedName))
            System.out.println("ID = " + employeeMap.getKey(wantedName)  );
        else
            System.out.println("Wrong Name!!");

    }
}
