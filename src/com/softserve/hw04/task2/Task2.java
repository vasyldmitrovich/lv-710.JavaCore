package com.softserve.hw04.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Create class Dog with fields name, breed, age.
 *  - Declare enum for field breed.
 *  - Create 3 instances of type Dog.
 *  - Check if there is no two dogs with the same name.
 *  - Display the name and the kind of the oldest dog.
 */
public class Task2 {
    public static void runTask2() {
        var dogs = new ArrayList<Dog>(){{
            add(new Dog("Charlie", Breed.BOXER, 5));
            add(new Dog("Rex", Breed.GERMAN_SHEPHERD, 8));
            add(new Dog("Rudy", Breed.CHIHUAHUA, 3));
        }};

        Set<String> names = dogs.stream()
                .map(Dog::getName)
                .collect(Collectors.toSet());

        if (names.size() < dogs.size()) {
            writeMessage("Present dogs with the same name");
        }

        Dog oldestDog = dogs.stream()
                .sorted(Comparator.comparingInt(Dog::getAge).reversed())
                .collect(Collectors.toList())
                .get(0);

        writeMessage(oldestDog.getName() + " " + oldestDog.getBreed());
    }
}
