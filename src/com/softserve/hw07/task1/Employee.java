package com.softserve.hw07.task1;

public abstract class Employee implements Payment, Comparable<Employee>{
    private final String employeeId;
    private final String name;
     
    public Employee(String employeeId, String name){
        this.employeeId=employeeId;
        this.name=name;
    }
    
    public String getEmployeeId(){ return employeeId; }
    public String name(){ return name; }
    
    @Override
    public int compareTo(Employee o){
        return (int) (((Payment)o).calculatePay() - ((Payment)this).calculatePay());
    }
    
    @Override
    public String toString(){
        return "ID: " + employeeId + "\n" + "Name: " + name + "\n" + "Average Monthly Salary: " + calculatePay() + "\n";
    }

    
    
}
