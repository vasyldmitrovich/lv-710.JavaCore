package com.softserve.edu09.hw.Person;

import java.util.HashSet;
import java.util.Set;

public class SetDemo<T> {
    public static <T> Set<T> union(Set set1,Set set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.print("The result of the union: ");
        return unionSet;
    }
    public static <T> Set<T> intersection(Set set1,Set set2) {
        Set<T> contSet = new HashSet<>(set1);
        contSet.retainAll(set2);
        System.out.print("The result of intersection: ");
        return contSet;
    }
}