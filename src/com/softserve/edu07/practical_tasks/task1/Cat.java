package com.softserve.edu07.practical_tasks.task1;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("eating fish...");
    }
}
