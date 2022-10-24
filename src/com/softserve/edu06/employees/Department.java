package com.softserve.edu06.employees;

public enum Department{
    ADMINISTRATOR("Administrator"),
    TEACHER("Teacher"),
    CLEANER("Cleaner"),
    DRIVER("Driver");

    public String department;

    Department(){}

    Department(String department){
        this.department = department;
    }
}
