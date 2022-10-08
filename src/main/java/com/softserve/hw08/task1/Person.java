package com.softserve.hw08.task1;

public abstract class Person {

    protected FullName fullName;
    private int age;
    private final String firstName, lastName;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = new FullName(this.firstName, this.lastName);
        this.age = age;
    }

    public abstract String activity();

    public String getFullName() {
        return this.fullName.getFullName();
    }

    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d", getFirstName(),
                getLastName(), getAge());
    }
}
