package com.softserve.edu06.employees;

public enum SalaryType {
    JUNIOR(4000),
    MIDDLE(6000),
    SENIOR(8000);

    public int salary;

    SalaryType(int salary) {
        this.salary = salary;
    }
}
