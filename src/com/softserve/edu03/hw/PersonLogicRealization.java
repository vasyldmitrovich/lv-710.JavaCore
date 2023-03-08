package com.softserve.edu03.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonLogicRealization {
    public static void runMyApp() throws IOException {
        createPersonsAndRuturnInfo();
    }
    public static Person input() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first name, last name and year of birth of person, using the \"ENTER\" key");
        return (new Person(br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
    }
    public static void output(Person person) {
        System.out.println("first name: " + person.getFirstName() + ", last name: "
                + person.getLastName() + ", year of birth: " + person.getBirthYear()
                + ", age: " + person.getAge());
    }
    public static void createPersonsAndRuturnInfo() throws IOException {
        Person[] person = new Person[]{input(), input(), input(), input(), input()};
        for (Person eachPerson :
                person) {
            output(eachPerson);
        }
    }
}

