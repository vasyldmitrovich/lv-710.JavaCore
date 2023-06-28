package com.softserve.edu07Interfaces.practik.Persons;

public class Student extends Person{
    private final String TYPE_PERSON = "Student";

    @Override
    public void print() {
        System.out.printf("My name is %s, I am a student\n", getName());
    }

    public Student() {
    }

    public Student(String name) {
        super(name);
        System.out.println("type of person: " + getTYPE_PERSON());
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
}
