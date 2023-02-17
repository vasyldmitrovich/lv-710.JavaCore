package com.softserve.edu03.hw;

import java.io.IOException;

public class PersonDemo extends PersonScanner {
    public static void main(String[] args) throws IOException {
        Person p1 = input();
        Person p2 = input();
        Person p3 = input();
        Person p4 = input();
        Person p5 = input();

        Person[] person = new Person[]{p1, p2, p3, p4, p5};
        for (Person eachPerson :
                person) {
            output(eachPerson);
        }
    }
}
