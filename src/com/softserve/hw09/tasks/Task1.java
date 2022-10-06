package com.softserve.hw09.tasks;

import com.softserve.IO.Output;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    static public void runTask1(){

        // Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
        // realizing the operations of union and intersection of two sets.
        // Test the operation of these techniques on two pre-filled sets.

        Random random = new Random();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 6; i++){
            set1.add(random.nextInt((15 - 1)));
            set2.add(random.nextInt((15 - 1)));
        }

        Output.print("set1: " + set1);
        Output.print("set2: " + set2);

        Output.print("merged set: " + mergeSets(set1, set2));

        Output.print("intersect set; " + intersectSet(set1, set2));
    }

    static private <T> Set<T> mergeSets(Set<T> inputFirstSet, Set<T> inputSecondSet){
        Set<T> resultSet = new HashSet<>();
        resultSet.addAll(inputFirstSet);
        resultSet.addAll(inputSecondSet);
        return resultSet;
    }

    static private <T> Set<T> intersectSet(Set<T> inputFirstSet, Set<T> inputSecondSet){
        Set<T> resultSet = new HashSet<>();
        resultSet.addAll(inputFirstSet);
        resultSet.retainAll(inputSecondSet);
        return resultSet;
    }

}
