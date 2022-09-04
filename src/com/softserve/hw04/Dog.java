package com.softserve.hw04;

public class Dog {
    private String name;
    private DogsBreeds breed;
    private int age;

    public Dog(){

    }

    public Dog(String name, DogsBreeds breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public DogsBreeds getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
