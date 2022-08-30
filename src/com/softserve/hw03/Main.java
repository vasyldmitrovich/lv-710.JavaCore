package com.softserve.hw03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> prsn = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            prsn.add(i, new Person());
            System.out.println("Set data for person " + (i + 1));
            prsn.get(i).input();
        }

        prsn.forEach(Person::output);

        prsn.get(1).changeName("Ivan", "Ivanov");
        prsn.get(1).setBirthYear(1982);
        prsn.get(2).changeName();

        prsn.forEach(Person::output);
    }
}
