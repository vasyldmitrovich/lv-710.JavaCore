package com.softserve.hw04.Controller;

import java.util.ArrayList;

public class Task2 {
    public static void run() {
        DogBreed SameBreed = null;
        ArrayList<DogBreed> dogBreedsArr = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Barsik", DogBreed.BULLDOG, 6));
        dogs.add(new Dog("Funtik", DogBreed.BOXER, 8));
        dogs.add(new Dog("Ponchik", DogBreed.LABRADOR, 3));
        dogBreedsArr.add(dogs.get(0).breed);
        Dog oldestDog = dogs.get(0);
        for (int i = 1; i < 3; i++) {
            if (dogBreedsArr.contains(dogs.get(i).breed)) SameBreed = dogs.get(i).breed;
            else dogBreedsArr.add(dogs.get(i).breed);
            if (dogs.get(i).age > oldestDog.age) oldestDog = dogs.get(i);
        }
        if (SameBreed!=null) System.out.println("There is two dogs with same breed - "+SameBreed);
        else System.out.println("There is no dogs with same breed");
        System.out.println("Oldest dog is " + oldestDog.name+", its age is"+oldestDog.age);
    }
}

