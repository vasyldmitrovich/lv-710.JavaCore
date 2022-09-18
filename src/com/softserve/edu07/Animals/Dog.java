package com.softserve.edu07.Animals;

public class Dog implements Animal{
    @Override
    public void feed() {
        System.out.println("Dog eat meat");
    }

    @Override
    public void voice() {
        System.out.println("Gav!");
    }
}
