package com.softserve.edu07.practik.Persons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyAppRealization {
    public static void createPersons() {
        Person[] persons = new Person[6];
        persons[0] = new Student(showMessageAndReturnInputData("Write name"));
        persons[1] = new Student(showMessageAndReturnInputData("Write name"));
        persons[2] = new Teacher(showMessageAndReturnInputData("Write name"));
        persons[3] = new Teacher(showMessageAndReturnInputData("Write name"));
        persons[4] = new Cleaner(showMessageAndReturnInputData("Write name"));
        persons[5] = new Cleaner(showMessageAndReturnInputData("Write name"));
        System.out.println();
        for (Person person:
             persons) {
            person.print();
            if (person instanceof Staff) {
                System.out.println(((Staff) person).salary());
            }
        }
    }
    public static String showMessageAndReturnInputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void main(String[] args) {
        createPersons();
    }
}