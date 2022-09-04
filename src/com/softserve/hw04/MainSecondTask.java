package com.softserve.hw04;

import java.util.Map;

public class MainSecondTask {

    public static void main(String[] args) {

        Dog d = new Dog();
        Dog dog1 = new Dog("Rogger", Breed.LABRADOR_RETRIEVER, 1);
        Dog dog2 = new Dog("Ice", Breed.GERMAN_SHEPHERD, 4);
        Dog dog3 = new Dog("Collin", Breed.HUSKY, 6);
        Dog dog4 = new Dog("Ice", Breed.GERMAN_SHEPHERD, 3);

        //Duplicate element from array
        d.getDuplicates(dog1, dog2, dog3, dog4);

        // Oldest dog
        Map<String, Integer> map = d.dogsToMap(dog1, dog2, dog3, dog4);
        d.maxUsingIteration(map);
    }
}
