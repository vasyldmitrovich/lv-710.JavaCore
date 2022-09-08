package com.softserve.edu05.practical_tasks.task2.entities;

public class Seller extends Employee {
    private static final int DEPARTMENT_NUMBER = 1;
    private String name;
    private double salary;

    public Seller() {
    }

    public Seller(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getDepartmentNumber() {
        return DEPARTMENT_NUMBER;
    }
    @Override
    public String toString() {
        return "Seller - " + name + ", salary - " + salary;
    }
}
