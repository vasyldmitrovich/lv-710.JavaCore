package com.softserve.edu07Interfaces.practik.Animals;

public class Dog implements Animal {

    @Override
    public String voice() {
        return "I'm dog and I'm barking";
    }

    @Override
    public String feed() {
        return "I eat meat";
    }
}
