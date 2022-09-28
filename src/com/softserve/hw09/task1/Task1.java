package com.softserve.hw09.task1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), realizing
 * the operations of union and intersection of two sets. Test the operation of these techniques on
 * two pre-filled sets.
 */
public class Task1 {
    public void run() {
        Set<Integer> set1 = new HashSet<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};
        Set<Integer> set2 = new HashSet<>() {{
            add(1);
            add(2);
            add(30);
            add(40);
            add(50);
            add(60);
            add(70);
        }};

        System.out.println("union" + union(set1, set2));
        System.out.println("intersect" + intersect(set1, set2));

    }

    private <T> Set<T> union(Set<T> set1, Set<T> set2) {
        return Stream.of(set1, set2)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    private <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        return set1.stream()
                .filter(value -> !set2.add(value))
                .collect(Collectors.toSet());
    }
}
