package com.softserve.hw03;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Person person = new Person();
            person.input();
            persons.add(person);
        }
        System.out.println();
        persons.forEach(Person::output);
    }

}
