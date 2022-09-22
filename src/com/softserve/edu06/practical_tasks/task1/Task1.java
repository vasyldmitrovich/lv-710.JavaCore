package com.softserve.edu06.practical_tasks.task1;

import java.util.Arrays;

/**
 * Task 1. Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
 * Develop classes Truck and Sedan which extend class Car.
 * In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it
 */
public class Task1 {

    public void run() {
        Car[] cars = {
                new Sedan(),
                new Sedan(),
                new Sedan(),
                new Truck(),
                new Truck(),
        };

        Arrays.stream(cars)
                .forEach(System.out::println);
    }
}
