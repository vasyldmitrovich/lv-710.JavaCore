package com.softserve.edu05.practical_tasks.task2.entities;

public class HR implements Employee {
    private static final int DEPARTMENT_NUMBER = 4;
    private String name;
    private double salary;

    public HR() {
    }

    public HR(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return DEPARTMENT_NUMBER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "HR - " + name + ", salary - " + salary;
    }
}
