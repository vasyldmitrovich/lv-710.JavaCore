package com.softserve.hw04;

import java.util.*;

public class MainSecondTask {

    public static void main(String[] args) {

        Dog d = new Dog();
        Dog dog1 = new Dog("Rogger", Breed.LABRADOR_RETRIEVER, 1);
        Dog dog2 = new Dog("Ice", Breed.GERMAN_SHEPHERD, 4);
        Dog dog3 = new Dog("Collin", Breed.HUSKY, 6);
        Dog dog4 = new Dog("Ice", Breed.GERMAN_SHEPHERD, 3);

        //Duplicate element from array
        d.getDuplicates(dog1, dog2, dog3, dog4);

        // Duplicates with Streams
        System.out.println(d.findDuplicates(d.dogsCollection(dog1.getBreed(), dog2.getBreed(), dog3.getBreed(), dog4.getBreed())));

        // Oldest dog
        Map<String, Integer> map = d.dogsToMap(dog1, dog2, dog3, dog4);
        d.maxUsingIteration(map);
        System.out.println();

        // Oldest dog with Streams
        Dog maxAge = d.dogsCollection(dog1, dog2, dog3, dog4)
                .stream()
                .max(Comparator.comparing(Dog::getAge))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxAge.getName() + " - " + maxAge.getAge());
    }
}
