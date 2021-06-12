package lesson9.task1;

import java.util.*;

public class Collect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new LinkedList<>();
        System.out.println("Enter 10 integer numbers");
        for (int i = 0; i < 10; i++) {
            int sc = scanner.nextInt();
            myCollection.add(sc);
        }
        for (int i = 0; i < myCollection.size(); i++) {
            if (i >= 5)
                newCollection.add(myCollection.get(i));
        }
        System.out.println("New collection : " + newCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20)
                myCollection.remove(i);
        }
        System.out.println("Result < 20 : " + myCollection);
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        Collections.sort(myCollection);
        System.out.println("Sorted collection: " + myCollection);
    }

}

