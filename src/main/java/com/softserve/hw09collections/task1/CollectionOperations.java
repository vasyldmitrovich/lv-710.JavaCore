package com.softserve.hw09collections.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperations {

    @SafeVarargs
    public final <T> Set<T> union(Set<T>... sets) {
        return Stream.of(sets)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    public <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        return set1.stream()
                .filter(value -> !set2.add(value))
                .collect(Collectors.toSet());
    }
}
