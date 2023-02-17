package com.softserve.edu03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonScanner {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Person input() throws IOException {
        System.out.println("Please enter your first name, last name and year of birth of person, using the \"ENTER\" key");
        return (new Person(br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
    }

    public static void output(Person person) {
        System.out.println("first name: " + person.getFirstName() +  ", last name: "
                + person.getLastName() +  ", year of birth: " + person.getBirthYear()
                + ", age: " + person.getAge());
    }
}

