package com.softserve.hw03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String firstName;
    private String lastName;
    private String birthDate;

    Person() {
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public long ageCalculation(String date) {
        LocalDate birthDate = LocalDate.parse(date , DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDate = LocalDate.parse(LocalDate.now().toString(), DateTimeFormatter.ISO_LOCAL_DATE);
        Duration duration = Duration.between(localDate.atStartOfDay(), birthDate.atStartOfDay());
        long durationDays = duration.toDays() / 365;
        return durationDays;
    }

    public String output() {
        return getFirstName() + " " +
                getLastName() + " " +
                getBirthDate();
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
