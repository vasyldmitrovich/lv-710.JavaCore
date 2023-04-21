package com.softserve.edu07.hw.Emploees;

import java.util.Comparator;

public abstract class Employee implements Payment, Comparator<Employee>, Comparable<Employee> {
    private String employeeld;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() + o2.getSalary();
    }

    @Override
    public int compareTo(Employee o) {
        return this.getSalary() + o.getSalary();
    }
}
