package com.softserve.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
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

    public int getAge() {
        LocalDate current_date = LocalDate.now();
        int current_year = current_date.getYear();
        return current_year - birthYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name ");
        lastName = scanner.nextLine();
        System.out.print("Enter birth year ");
        birthYear = Integer.parseInt(scanner.nextLine());
    }

    public String output(){
        return firstName + " " + lastName + " borned in " + birthYear;
    }
}
