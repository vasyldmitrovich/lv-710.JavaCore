package com.softserve.edu05.practic.Employee;

import java.util.Objects;

public class Employee {
    private String name;
    private int departmentNumber, salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
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

        if (departmentNumber != employee.departmentNumber) return false;
        if (salary != employee.salary) return false;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + departmentNumber;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "{" + name  +
                ", " + departmentNumber +
                ", " + salary + "}";
    }
}
