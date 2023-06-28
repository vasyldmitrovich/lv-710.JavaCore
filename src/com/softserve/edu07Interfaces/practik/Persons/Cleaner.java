package com.softserve.edu07Interfaces.practik.Persons;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
    }

    public Cleaner(String name) {
        super(name);
        System.out.println("type of person: " + getTYPE_PERSON());
    }

    @Override
    public void print() {
        System.out.printf("My name is %s, I am a cleaner\n", getName());
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String salary() {
        return "My salary is 10000";
    }
}
