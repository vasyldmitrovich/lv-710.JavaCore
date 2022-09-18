package com.softserve.edu07.Animals;

import java.util.ArrayList;

public class Utils {
    public static void run(){
        var animalArr = new ArrayList<Animal>();
        animalArr.add(new Cat());
        animalArr.add(new Cat());
        animalArr.add(new Dog());
        animalArr.add(new Cat());
        animalArr.add(new Dog());
        animalArr.add(new Dog());
        animalArr.add(new Dog());
        animalArr.add(new Cat());
        animalArr.add(new Cat());
        for (Animal animal: animalArr
             ) {
            animal.feed();
            animal.voice();
        }
    }
}
