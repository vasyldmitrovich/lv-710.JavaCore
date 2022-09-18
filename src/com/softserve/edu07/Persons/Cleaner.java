package com.softserve.edu07.Persons;

public class Cleaner extends Staff{
    public final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am cleaner");
    }

    @Override
    void salary() {
        System.out.println("I have salary");

    }
}
