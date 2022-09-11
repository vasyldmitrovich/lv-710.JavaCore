package com.softserve.hw05;

public class Employee {

    private String name;
    private Department depName;
    private int salary;

    public Employee(String name, Department depName, int salary) {
        this.name = name;
        this.depName = depName;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getDepName() {
        return this.depName.getDepName();
    }

    public int getDepNumber() {
        return this.depName.getDepNumber();
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee name: " + getName() +", "
                + "Department name: " + getDepName()
                + "Department number: " + getDepNumber()
                + "Employee salary: " + getSalary();
    }
}
