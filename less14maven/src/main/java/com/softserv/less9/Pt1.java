package com.softserve.edu.less9;

import java.util.*;

public class Pt1 {
    public static void main(String[] args) {
        int wantedNumber = 3;
        List<Integer> myCollection = new ArrayList<>();
        myCollection.add(8);
        myCollection.add(10);
        myCollection.add(3);
        myCollection.add(10);
        myCollection.add(8);
        myCollection.add(25);
        myCollection.add(8);
        myCollection.add(10);
        myCollection.add(4);
        myCollection.add(10);

//        myCollection.

        System.out.println(myCollection);

        List<NewCollection> newCollections = new ArrayList<>();
/*        newCollections.add(new NewCollection(8));
        newCollections.add(new NewCollection(25));
        System.out.println("index 25 present - " + newCollections.contains(new NewCollection(25)));
*/
        int newI = -1 , i, j, myCollectionSize = myCollection.size();
        for (i = 0; i < myCollectionSize; i++) {
            if (!newCollections.contains(new NewCollection(myCollection.get(i)))){
                newCollections.add(new NewCollection(myCollection.get(i)));
//                newI = 0;
                newCollections.get(++newI).addIndexes(i);
                for (j = i+1; j < myCollectionSize; j++)
                    if (myCollection.get(j).equals(myCollection.get(i))){
                        newCollections.get(newI).addIndexes(j);
                    }
                if (newCollections.get(newI).getIndexes().size() < wantedNumber)
                    newCollections.remove(newI--);
            }

        }
//        for (NewCollection current : newCollections)
        System.out.println(newCollections);//current);

        myCollection.removeIf( n -> (n > 20));
        System.out.println("myCollection cleared off greater 20: " + myCollection );

        myCollection.add(2-1, 1);
        myCollection.add(8-1, -1);
        myCollection.add(5-1, -4);
       System.out.println("myCollection some inserts: " + myCollection );
//        for (List current : myCollection)
//            System.out.println("Position " + current.);
        Iterator<Integer> iteratorMyCollection = myCollection.iterator();
        i = 0;
        while (iteratorMyCollection.hasNext()) {
            System.out.println("postion: " + i++ + ", value " + iteratorMyCollection.next());
        }


//         comparator = ;
        Collections.sort(myCollection);
        System.out.println("myCollection sorted: " + myCollection );




    }

}
