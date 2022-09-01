package com.softserve.hw04.Controller;

import java.util.ArrayList;

public class Task2 {
    public static void run() {
        DogBreed dogWithSameBreed = null;
        ArrayList<Dog>
                dogs = new ArrayList<>();
        dogs.add(new Dog("Barsik", DogBreed.BULLDOG, 6));
        dogs.add(new Dog("Funtik", DogBreed.BOXER, 8));
        dogs.add(new Dog("Ponchik", DogBreed.LABRADOR, 3));
        ArrayList<DogBreed> dogBreedArr = new ArrayList<>();
        Dog oldestDog = dogs.get(0);
        dogBreedArr.add(dogs.get(0).breed);
        oldestDog = dogs.get(0);
        for (int i = 1; i < 3; i++) {
            if (dogBreedArr.contains(dogs.get(i).breed)) dogWithSameBreed = dogs.get(i).breed;
            else dogBreedArr.add(dogs.get(i).breed);
            if (dogs.get(i).age > oldestDog.age) oldestDog = dogs.get(i);
        }
        if (dogWithSameBreed!=null) System.out.println("There is two dogs with same breed - "+dogWithSameBreed);
        else System.out.println("There is no dogs with same breed");
        System.out.println("Oldest dog is " + oldestDog.name+", its age is"+oldestDog.age);
    }
}

