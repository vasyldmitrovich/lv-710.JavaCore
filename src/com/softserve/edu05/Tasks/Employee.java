package com.softserve.edu05.Tasks;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;
    Employee(String name, int departmentNumber, double salary){
        this.name=name;
        this.departmentNumber=departmentNumber;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    @Override
    public String toString(){
        return "Employee [name: "+name+", departmentNumber: "+departmentNumber+", salary: "+salary+']';
    }
}
