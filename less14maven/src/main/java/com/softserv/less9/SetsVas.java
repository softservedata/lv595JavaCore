package com.softserve.edu.less9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetsVas<T> {
    public Set<T>  interSets (Set<T> set1, Set<T> set2){
        Set<T> reset = new TreeSet<>();
//        for(<T> current : set1)
        Iterator iterSet1 = set1.iterator();
        Integer current;
        while(iterSet1.hasNext()){
            current = (Integer) iterSet1.next();
             if (set2.contains(current)) {
                reset.add((T) current);
            }
        }
    return   reset;
    }

    public Set<T>  unionSets (Set<T> set1, Set<T> set2){
        Set<T> reset = new TreeSet<>();
        reset.addAll(set1);
        reset.addAll(set2);
//        for(<T> current : set1)
/*
        Iterator iterSet1 = set1.iterator();
        Integer current;
        while(iterSet1.hasNext()){
            current = (Integer) iterSet1.next();
            if (set2.contains(current)) {
                reset.add((T) current);
            }
        }
*/
        return   reset;
    }

}
