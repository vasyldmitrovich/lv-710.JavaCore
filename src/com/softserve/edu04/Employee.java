package com.softserve.edu04;

import java.util.ArrayList;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    private int newRate;
    private final double bonuses = 1.1;
    private ArrayList<Employee> list;
    private int count;

    Employee() {
    }

    Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return  this.rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }

    public void setNewRate(int newRate) {
        this.newRate = newRate;
    }

    public int getNewRate() {
        return newRate;
    }

    public int getSalary() {
        return this.rate * this.hours;
    }

    public int getNewSalary() {
        return this.newRate * this.hours;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + "\n" +
                "Rate: " + getRate() + "\n" +
                "Hours: " + getHours() + "\n";
    }

    public int changeRate(int newRate) {
        this.newRate = newRate;
        return newRate * this.hours;
    }

    public double getBonuses() {
        return this.bonuses * getSalary();
    }

    public double totalSum(ArrayList<Employee> employees) {
        double totalSum = 0;
        for (Employee employee : employees) {
            double salary = employee.getSalary();
            totalSum = totalSum + salary;
        }
        return totalSum;
    }

    public int getEmployeesNumber() {
        ArrayList<Employee> employees = new ArrayList<>();
        double sum = list.stream().filter(o -> o.getSalary() > 10).mapToDouble(Employee::getSalary).sum();
        return (int) sum;
    }

//    public ArrayList<Employee> getEmployeeNumber(Employee... employees) {
//        ArrayList<Employee[]> e = new ArrayList<>();
//        ArrayList<Employee[]> emp;
//        for (int i = 0; i<= employees.length; i++) {
//            emp = e.add(employees);
//        }
//
//    }
}
