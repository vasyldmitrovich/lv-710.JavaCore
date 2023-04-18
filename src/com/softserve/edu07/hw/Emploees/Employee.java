package com.softserve.edu07.hw.Emploees;

import java.util.Objects;

public class Employee implements Payment, Comparable{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return Objects.equals(employeeld, employee.employeeld);
    }

    @Override
    public int hashCode() {
        return employeeld != null ? employeeld.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                '}';
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
