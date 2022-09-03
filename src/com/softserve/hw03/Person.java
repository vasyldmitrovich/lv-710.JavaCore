package com.softserve.hw03;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
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

    public void output() {
        System.out.println(this);
        System.out.println("Age " + firstName + " - " + getAge());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void input() {
        System.out.println("Enter person Name or FirstName and LastName:");
        String nameElements = ConsoleHelper.getDataFromConsole();//Good decision
        changeName(nameElements.split(" "));

        System.out.println("Enter year of birth:");
        try {
            int birthdayYear = Integer.parseInt(ConsoleHelper.getDataFromConsole());
            if (birthdayYear > 0)
                birthYear = birthdayYear;
        } catch (NumberFormatException ignore) {
            System.out.println("denied");
        }
    }

    public int getAge() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(formatter.format(new Date()));
        if (birthYear > 0)
            return currentYear - birthYear;
        return 0;
    }

    public void changeName(String... nameElements) {
        int length = nameElements.length;
        if (length > 1)
            lastName = nameElements[1];
        if (length > 0)
            firstName = nameElements[0];
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);
    }
}
