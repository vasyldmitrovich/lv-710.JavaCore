package com.softserve.edu05.practical_tasks.task2.entities;

public class Developer extends Employee {
    private static final int DEPARTMENT_NUMBER = 2;
    private String name;
    private double salary;

    public Developer() {
    }

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer - " + name + ", salary - " + salary;
    }

    @Override
    public int getDepartmentNumber() {
        return DEPARTMENT_NUMBER;
    }
}
