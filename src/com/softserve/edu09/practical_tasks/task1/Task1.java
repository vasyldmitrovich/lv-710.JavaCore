package com.softserve.edu09.practical_tasks.task1;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Declare collection myCollection of 10 integers and fill it (from the console or random).
 * <p>- Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
 * <p>- Remove from collection myCollection elements, which are greater then 20. Print result
 * <p>- Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
 * <p>- Sort and print collection
 * <p>
 * Use one or more of the next Collections: List, ArrayList, LinkedList
 */
public class Task1 {
    public void run() {
        List<Integer> myCollection = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(ThreadLocalRandom.current().nextInt(-100, 100));
        }
        System.out.println("myCollection" + myCollection);

        List<Integer> newCollection = new LinkedList<>();
        for (Integer i : myCollection) {
            if (i > 5)
                newCollection.add(i);
        }
        System.out.println("newCollection" + newCollection);

        myCollection.removeIf(i -> i > 20);
        System.out.println("myCollection" + myCollection);

        while (myCollection.size() < 2) {
            myCollection.add(0);
        }
        myCollection.add(2, 1);

        while (myCollection.size() < 5) {
            myCollection.add(0);
        }
        myCollection.add(5, -4);

        while (myCollection.size() < 8) {
            myCollection.add(0);
        }
        myCollection.add(8, -3);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – [" + i + "], value of element – [" + myCollection.get(i)+"]");
        }

        Collections.sort(myCollection);
        System.out.println("myCollection" + myCollection);
    }
}
