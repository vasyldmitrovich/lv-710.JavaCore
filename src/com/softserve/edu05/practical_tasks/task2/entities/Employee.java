package com.softserve.edu05.practical_tasks.task2.entities;

public abstract class Employee {
    private String name;
    private double salary;


    public abstract int getDepartmentNumber();

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

}
