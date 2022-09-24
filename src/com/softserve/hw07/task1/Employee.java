package com.softserve.hw07.task1;

import static java.lang.Double.compare;

public abstract class Employee implements Payment, Comparable<Employee>{
    private String employeeID;
    private String name;

    public Employee() {
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return compare(this.calculatePay(), o.calculatePay());
    }
}
