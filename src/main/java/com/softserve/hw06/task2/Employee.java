package com.softserve.hw06.task2;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String  report() {
        return String.format("Name: %s, Age: %s, Salary: \u20B4 %.2f.", name, age, salary);
    }
}
