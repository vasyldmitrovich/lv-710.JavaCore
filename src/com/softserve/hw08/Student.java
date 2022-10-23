package com.softserve.hw08;

public class Student extends Person {
    int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age +
        ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at a university";
    }
}
