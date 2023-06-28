package com.softserve.edu09.hw.Person;

import java.util.HashSet;
import java.util.Set;

import static com.softserve.edu09.hw.Person.SetDemo.intersection;
import static com.softserve.edu09.hw.Person.SetDemo.union;

public class App {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(union(set1, set2));
        System.out.println("------");
        System.out.println(intersection(set1, set2));
    }
}
