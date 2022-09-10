package com.softserve.hw04;

import java.util.*;
import java.util.stream.Collectors;

public class Dog {

    private String name;
    private Breed breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed.getBreed();
    }

    public int getAge() {
        return this.age;
    }

    public void getDuplicates(Dog... breeds) {
        Map<String, Integer> nameAndCount = new HashMap<>();
        for(Dog breed : breeds) {
            Integer count = nameAndCount.get(breed.getBreed());
            if (count == null) {
                nameAndCount.put(breed.getBreed(), 1);
            } else {
                nameAndCount.put(breed.getBreed(), ++count);
            }
        }
            Set<Map.Entry<String, Integer>> entrySet = nameAndCount.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() > 1) {
                    System.out.println("Duplicated element from the array is: " + entry.getKey());
                }
        }
    }

    public <K, V extends Comparable<V>> V maxUsingIteration(Map<K, V> map) {
        Map.Entry<K, V> maxEntry = null;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey() + " - " + maxEntry.getValue());
        return maxEntry.getValue();
    }

    public Map<String, Integer> dogsToMap(Dog... dogs) {
        Map<String, Integer> nameAndAge = new HashMap<>();
        for(Dog dog : dogs) {
            nameAndAge.put(dog.getName(), dog.getAge());
        }
        return nameAndAge;
    }

    public List<String> dogsCollection(String... dogs) {
        List<String> collection = Arrays.asList(dogs);;
        return collection;
    }

    public List<Dog> dogsCollection(Dog... dogs) {
        List<Dog> collection = Arrays.asList(dogs);;
        return collection;
    }

    public <T> Set<T> findDuplicates(List<T> dogsCollection) {
        Set<T> items = new HashSet<>();
        return dogsCollection.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }
}
