package com.softserve.edu05.practical_tasks.task2.entities;

public class HR extends Employee {
    private static final int DEPARTMENT_NUMBER = 4;
    private String name;
    private double salary;

    public HR() {
    }

    public HR(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getDepartmentNumber() {
        return DEPARTMENT_NUMBER;
    }

    @Override
    public String toString() {
        return "HR - " + name + ", salary - " + salary;
    }
}
