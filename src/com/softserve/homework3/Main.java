package com.softserve.homework3;
import com.softserve.homework3.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.changeNames(null, "Oleksandr");
        System.out.println(person.output());

        person.input();
        System.out.println(person.output());
        System.out.println(person.getFirstName() + " age - " + person.getAge());
    }
}
