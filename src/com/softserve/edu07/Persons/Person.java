package com.softserve.edu07.Persons;

public abstract class Person {
    private final String name;

    public String getName() {
        return name;
    }

    abstract void print();

    public Person(String name) {
        this.name = name;
    }
}
