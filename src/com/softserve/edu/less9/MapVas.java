package com.softserve.edu.less9;

import java.util.HashMap;
import java.util.Map;

interface MapVas<K,V> extends Map<K,V> {
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
/*
     @Override
     public int hashCode() {
         return super.hashCode() + super.size();
//         super.e\
     }

     @Override
     public boolean equals(Object o) {
        if (o == null ) return false;
        if (o.getClass() != this.getClass()) return false;
        if (o.hashCode() == this.hashCode())
         return super.equals(o);
     }
*/

     @Override
     public boolean equals(Object o) {
         return super.equals(o);
     }

     @Override
     public int hashCode() {
         return super.hashCode();
     }
 }
