package com.softserve.hw04;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog() {
    }

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
        else System.out.println("wrong data");
    }

    public void setAge(int age) {
        if (age < 0) this.age = age;
        else System.out.println("wrong data");
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}
