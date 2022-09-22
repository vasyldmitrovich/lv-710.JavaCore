package com.softserve.edu07.practical_tasks.task1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Baw-baw!");
    }

    @Override
    public void feed() {
        System.out.println("chewing bones...");
    }
}
