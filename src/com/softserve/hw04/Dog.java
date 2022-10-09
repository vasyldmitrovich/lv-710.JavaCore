package com.softserve.hw04;

import java.lang.reflect.Array;

public class Dog {
    String name;
    Breed breadName;
    int age;

    public enum Breed {
        AKITA,
        FRENCH_BULLDOG,
        SPANIEL,
        LABRADOR,
        SHIBA_INU,
        SAMOYED;

    }

    public Dog(String name, Breed breadName, int age) {
        this.name = name;
        this.breadName = breadName;
        this.age = age;
    }
    int max = Integer.MIN_VALUE;

    public void maxAge(){
        
    }
}
