package com.softserve.edu07.practik.Persons;

public abstract class Staff extends Person {

    public abstract String salary();

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }
}
