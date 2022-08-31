package com.softserve.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private int birthYear;

    Person() {
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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


    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first name:");
        String tempFirstName = br.readLine();
        System.out.println("Enter last name:");
        String tempLastName = br.readLine();
        System.out.println("Enter birth year:");
        int tempBirthYear = Integer.parseInt(br.readLine());
        this.firstName = tempFirstName;
        this.lastName = tempLastName;
        this.birthYear = tempBirthYear;
    }

    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person {" +
                " First name: " + this.firstName +
                ", last name: " + this.lastName +
                ", birth year: " + this.birthYear + "}";
    }

    public void changeName(String firstName, String lastName) {
        if (!firstName.isBlank()) this.firstName = firstName;
        if (!lastName.isBlank()) this.lastName = lastName;
    }
}
