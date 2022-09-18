package com.softserve.edu07.Persons;

public class Teacher extends Staff{
    public final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am teacher");
    }

    @Override
    void salary() {
        System.out.println("I have salary");
    }
}
