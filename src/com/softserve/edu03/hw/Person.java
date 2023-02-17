package com.softserve.edu03.hw;

import java.io.IOException;
import java.time.Year;
import java.util.Objects;

public class Person {

    private static final int CURRENT_YEAR = Year.now().getValue();
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public Person() throws IOException {
    }

    public Person(String firstName, String lastName, int birthYear) throws IOException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        return (CURRENT_YEAR - getBirthYear());
    }

    public void changeName(String fn, String ln) {
        if (fn != null) {
            fn = firstName;
        }
        if (ln != null) {
            ln = lastName;
        }
        System.out.println("firstName: " + fn + "\nlastName: " + ln);
    }
}
