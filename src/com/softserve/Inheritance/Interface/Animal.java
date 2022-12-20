package com.softserve.Inheritance.Interface;

public class Animal implements Info{
    int id;
    Animal (int id) {
        this.id = id;
    }
    @Override
    public void showInfo() {
        this.id = id;
        System.out.println("это кличка: " + id );
    }
}
