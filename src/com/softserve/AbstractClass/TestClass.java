package com.softserve.AbstractClass;

public class TestClass {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        TestInt testInt = new Cat();    // нельзя сознать объект интерфейса
        Animal animal = new Cat();     // нельзя сознать объект абстрактного класса
        kitty.eat();
        kitty.makeSound();
        kitty.sleep();
        Cat.Wool wool = new Cat.Wool();
        wool.rolling();

    }
}

