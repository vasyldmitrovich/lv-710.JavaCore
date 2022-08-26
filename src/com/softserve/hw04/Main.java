package com.softserve.hw04;

import com.softserve.hw04.io.Input;

public class Main {

    static Input input = new Input();

    public static void main(String[] args) {
        Person personOne = new Person(input.inputFirstName(), input.inputLastName(), input.inputBirthDate());
        System.out.println(personOne.ageCalculation(personOne.getBirthDate()));

        System.out.println(personOne.output());

        personOne.changeName("Jo", "Jo");
        System.out.println(personOne.getFirstName() + " " + personOne.getLastName());


    }
}
