package com.softserve.hw3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthDate;
    Scanner input = new Scanner(System.in);
    boolean inputIsCorrect = false;

    public Person(){

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getBirthDate() {
        return this.birthDate;
    }

    public int getAge() {
        return 2022 - this.birthDate;
    }

    public void input() {
        System.out.println("Please, enter your first name");
        this.firstName = input.nextLine();
        System.out.println("Please, enter your last name");
        this.lastName = input.nextLine();
        System.out.println("Please, enter your birth year");
        while (!inputIsCorrect){
            try {
                this.birthDate = Integer.parseInt(input.nextLine());
                inputIsCorrect = true;
            } catch (NumberFormatException e) {
                System.out.println("You need to enter your birth year, for example - 1999");
            }
        }
    }

    public void output() {
        System.out.println(getFirstName() + " " + getLastName() + " was born in " + getBirthDate() + ", he/she is " +
                getAge() + " years old");
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
