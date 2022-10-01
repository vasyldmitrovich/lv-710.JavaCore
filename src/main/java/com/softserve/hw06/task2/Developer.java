package com.softserve.hw06.task2;

public class Developer extends Employee {

    private String name;
    private int age;
    private String position;
    private double salary;

    public Developer() {
    }

    public Developer(String name, int age, String position, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %s, Position: %s, Salary: \u0024 %.2f.", name, age, position, salary);
    }
}
