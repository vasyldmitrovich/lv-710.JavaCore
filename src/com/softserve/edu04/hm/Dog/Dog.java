package com.softserve.edu04.hm.Dog;

import java.io.IOException;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) throws IOException {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
