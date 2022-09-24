package com.softserve.edu07.practical_tasks.task2;

public class Student extends Person{
    private final String TYPE_PERSON;

    public Student() {
        this.TYPE_PERSON = getClass().getSimpleName();
        System.out.println(TYPE_PERSON);
    }

    public Student(String name) {
        super(name);
        this.TYPE_PERSON = getClass().getSimpleName();
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("“I am a " + TYPE_PERSON + "”");
    }
}
