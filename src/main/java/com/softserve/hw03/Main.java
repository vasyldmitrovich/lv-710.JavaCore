package com.softserve.hw03;

import com.softserve.hw03.io.Input;

public class Main {

    static Input input = new Input();

    public static void main(String[] args) {

        Person person1 = new Person(input.inputFirstName(), input.inputLastName(), input.inputBirthDate());
        System.out.println(person1.ageCalculation(person1.getBirthDate()));
        System.out.println(person1.output());
        person1.changeName("Jo", "Jo");
        System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + person1.getBirthDate());
    }
}
