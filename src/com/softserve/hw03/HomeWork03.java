package com.softserve.hw03;

import java.util.Scanner;

public class HomeWork03 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Person person1 = input();
        Person person2 = input();
        Person person3 = input();
        Person person4 = input();
        Person person5 = input();

        Person[] people = new Person[]{person1, person2, person3, person4, person5};

        output(people);

    }


    public static Person input() {
        System.out.println("Hello person! Please write your first name," +
                " then last name and finally birth year");

        return new Person(scanner.nextLine(), scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()));
    }

    public static void output(Person[] people) {

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
