package com.softserve.edu07.practical_tasks.task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON;

    public Cleaner() {
        this.TYPE_PERSON = getClass().getSimpleName();
        System.out.println(TYPE_PERSON);
    }

    public Cleaner(String name) {
        super(name);
        this.TYPE_PERSON = getClass().getSimpleName();
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("“I am a " + TYPE_PERSON + "”");
    }

    @Override
    public void salary() {
        System.out.println("Pay salary for " + TYPE_PERSON + "...");
    }
}
