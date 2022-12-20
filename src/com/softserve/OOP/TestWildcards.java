package com.softserve.OOP;

import com.softserve.Inheritance.Animal;
import com.softserve.Inheritance.Dog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestWildcards {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(7));
        listOfAnimals.add(new Animal(19));
        test1( listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(1));
        listOfDogs.add(new Dog(12));
        test1( listOfDogs);
    }

    public static void test1(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();

        }
    }
}