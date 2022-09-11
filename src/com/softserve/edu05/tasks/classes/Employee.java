package com.softserve.edu05.tasks.classes;

public class Employee {
    private String name;
    private int departmentNumber;
    private float salary;

    public Employee (){

    }

    public Employee (String name, int departmentNumber, float salary){
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}
