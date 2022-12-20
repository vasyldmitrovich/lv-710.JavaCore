package com.softserve.Inheritance.Interface;

public class Person implements Info {
String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        this.name = name;
        System.out.println("это имя: " + name );
    }
}
