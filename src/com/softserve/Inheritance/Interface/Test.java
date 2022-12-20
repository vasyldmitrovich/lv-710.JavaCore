package com.softserve.Inheritance.Interface;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Animal(1);
        dog.showInfo();

        Person man = new Person("Jack");
        man.showInfo();
        Info cat = new Animal(4);
        Info woman = new Person("Lucy");
        woman.showInfo();
        cat.showInfo();
        System.out.println();
        outputInfo(dog);
        outputInfo(man);
    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
