package com.softserve.hw07.task1;

import static java.lang.Long.compare;

public class Employee implements Payment, Comparable<Employee>{

    private String employeeId;

    public Employee(){}

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getSalary(){
        return 0;
    }

    @Override
    public int compareTo(Employee o) {
        return compare(this.calculatePay(), o.calculatePay());
    }

    @Override
    public int calculatePay() {
        return 0;
    }
}
