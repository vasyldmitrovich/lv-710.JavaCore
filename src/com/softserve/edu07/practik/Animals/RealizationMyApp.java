package com.softserve.edu07.practik.Animals;

public class RealizationMyApp {
    public static void createAnimals() {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal[] animals = {cat1, cat2, dog1, dog2};
        for (Animal animal :
                animals) {
            System.out.println(animal.voice() + " and " + animal.feed());
        }
    }
    public static void main(String[] args) {
        createAnimals();
    }
}
