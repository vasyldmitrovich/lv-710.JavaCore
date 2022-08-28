package com.softserve.hw03;

import java.util.Calendar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private int birthYear = 0;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    Person() {

    }

    Person(String firstName, String lastName) throws IOException {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName + " " + lastName + " added, enter birth year:");
        this.birthYear = Integer.parseInt(br.readLine());
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    public void input() throws IOException {
        System.out.println("Enter first name:");
        String firstName = br.readLine();
        System.out.println("Enter last name:");
        String lastName = br.readLine();
        System.out.println("Enter birth year:");
        int birthYear = Integer.parseInt(br.readLine());
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "First name: " + this.firstName +
                ", last name: " + this.lastName +
                ", birth year: " + this.birthYear;
    }

    public void changeName(String firstName, String lastName) {
        if (!firstName.isBlank()) this.firstName = firstName;
        if (!lastName.isBlank()) this.lastName = lastName;
    }

    public void changeName(String anyName) throws IOException {
        System.out.println("Change first or last name? Type 1 for first and 2 for last");
        int fl = Integer.parseInt(br.readLine());
        switch (fl) {
            case 1:
                this.firstName = anyName;
            case 2:
                this.lastName = anyName;
        }
    }
}
