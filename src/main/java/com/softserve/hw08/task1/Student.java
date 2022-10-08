package com.softserve.hw08.task1;

public class Student extends Person {

    private final int courseNumber, age;
    private final String firstName, lastName;

    public Student(String firstName, String lastName, int age, int courseNumber) {
        super(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return this.courseNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String activity() {
        return "My name is, " + getFullName() + "." + " I am studying at university.";
    }

    @Override
    public String info() {
        return String.format("%s, %s", super.info(), getCourseNumber());
    }
}
