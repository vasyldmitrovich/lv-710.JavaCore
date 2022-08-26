package com.softserve.hw3;

public class Main {
    public static void main(String[] args) {
        Person georgeSmith = new Person("George", "Smith");
        georgeSmith.setBirthDate(1996);
        georgeSmith.getAge();
        georgeSmith.output();
        georgeSmith.changeName("Yurii", "Koval");
        georgeSmith.output();
    }
}
