package com.softserve.edu07.Persons;

public class Student extends Person{
    public final String TYPE_PERSON = "Student";
    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am student");
    }
}
