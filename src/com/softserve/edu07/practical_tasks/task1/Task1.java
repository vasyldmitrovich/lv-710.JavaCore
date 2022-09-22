package com.softserve.edu07.practical_tasks.task1;

import java.util.Arrays;

/**
 * Create interface Animal with methods voice() and feed(). Create two classes Cat and Dog, which
 * implement this interface. Create array of Animal and add some Cats and Dogs to it.
 * Call voice() and feed() method for all of it
 */
public class Task1 {
    public void run() {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cat(),
                new Dog()
        };

        Arrays.stream(animals).forEach(animal -> {
            animal.voice();
            animal.feed();
        });
    }
}
