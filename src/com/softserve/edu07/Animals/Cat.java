package com.softserve.edu07.Animals;

public class Cat implements Animal{
    @Override
    public void feed() {
        System.out.println("Cat eat mouse");
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }
}
