package com.softserve.hw06.task2;

public class Developer extends Employee{

    private String name;
    private int age;
    private double salary;

    public Developer(String name, int age, double salary){
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %s, Salary: %.2f.", name, age, salary);
    }
}
