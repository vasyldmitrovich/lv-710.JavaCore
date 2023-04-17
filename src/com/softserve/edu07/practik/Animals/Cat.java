package com.softserve.edu07.practik.Animals;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "I'm cat and I'm meowing";
    }

    @Override
    public String feed() {
        return "I drink milk";
    }
}
