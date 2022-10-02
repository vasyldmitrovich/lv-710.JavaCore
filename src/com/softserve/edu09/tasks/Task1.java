package com.softserve.edu09.tasks;

import com.softserve.IO.Output;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {

    public static void runTask1(){

        // Declare collection myCollection of 10 integers and fill it (from the console or random).

        Random random = new Random();
        List<Integer> myCollection  = new ArrayList<>();

        for (int i = 0; i < 11; i++){
            myCollection.add(random.nextInt((30 - 1)));
        }

        Output.print("myCollection: " + myCollection );

        // Find and save in list newCollection all positions of element more than 5 in the collection.
        // Print newCollection

        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++){
            if (myCollection.get(i) > 5){
                newCollection.add(i);
            }
        }

        Output.print("newCollection: " + newCollection);

        // Remove from collection myCollection elements, which are greater then 20. Print result

        for (int i = 0; i < myCollection.size(); i++){
            if (myCollection.get(i) > 20){
                myCollection.remove(i);
                i--;
            }
        }

        Output.print("myCollection after removing of elements grater than 20: " + myCollection);

        // Insert elements 1, -3, -4 in positions 2, 8, 5.
        // Print result in the format: “position – xxx, value of element – xxx”

        myCollection.add(2, 1);
        myCollection.add(8,-3);
        myCollection.add(5, -4);

        for (int template : myCollection){
            Output.print("position - " + myCollection.indexOf(template)
                    + ", value of element: " + myCollection.get(myCollection.indexOf(template)));
        }


        // Sort and print collection

        myCollection.sort(Integer::compareTo);
        Output.print("Sorted myCollection: " + myCollection);

    }

}
