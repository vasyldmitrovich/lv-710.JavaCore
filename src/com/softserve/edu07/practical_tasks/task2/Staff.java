package com.softserve.edu07.practical_tasks.task2;

public abstract class Staff extends Person {
    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    public abstract void salary();
}
