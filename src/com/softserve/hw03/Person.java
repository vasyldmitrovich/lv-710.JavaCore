package com.softserve.hw03;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String firstName, lastName;
    private int birthYear;

    Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAge() {
        LocalDate now = LocalDate.now();
        LocalDate bDay = now.minusYears(birthYear);
        String bDayFormat = bDay.format(DateTimeFormatter.ofPattern("yy"));
        return bDayFormat;
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public String capitStr(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public void changeName() throws IOException {
        System.out.print("\nDo you want to change first (1) or last (2) name? (enter 1 or 2): ");
        int input = Main.getInputInt();
        String strInput;
        switch (input) {
            case 1:
                System.out.print("Enter first name: ");
                strInput = Main.getInputString();
                firstName = strInput;
                break;
            case 2:
                System.out.print("Enter last name: ");
                strInput = Main.getInputString();
                lastName = strInput;
                break;
            default:
                System.out.println("\nwrong input");
        }
    }

    public void input() throws IOException {
        System.out.print("Enter first name: ");
        this.firstName = Main.getInputString();
        System.out.print("Enter last name: ");
        this.lastName = Main.getInputString();
        System.out.print("Enter birth year: ");
        this.birthYear = Main.getInputInt();
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "firstName: " + capitStr(firstName) +
                ", lastName: " + capitStr(lastName) +
                ", birthYear: " + birthYear +
                ", age: " + getAge() + ";";
    }
}
