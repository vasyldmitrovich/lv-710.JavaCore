package com.softserve.edu05.practical_tasks.task2.entities;

public class Analyst extends Employee {
    private static final int DEPARTMENT_NUMBER = 3;
    private String name;
    private double salary;

    public Analyst() {
    }

    public Analyst(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Analyst - " + name + ", salary - " + salary;
    }

    @Override
    public int getDepartmentNumber() {
        return DEPARTMENT_NUMBER;
    }
}
