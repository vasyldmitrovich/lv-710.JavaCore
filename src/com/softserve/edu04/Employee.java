package com.softserve.edu04;

import java.util.ArrayList;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    private int newRate;//TODO rate must be only one
    private final double bonuses = 1.1;
    private ArrayList<Employee> list;//TODO this field you do not use in your object, delete that field
    private int count;//TODO do not needed count, need static totalSum

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

    //TODO method salary must be only one, that method return salary
    public int getNewSalary() {
        return this.newRate * this.hours;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + "\n" +
                "Rate: " + getRate() + "\n" +
                "Hours: " + getHours() + "\n";
    }

    //TODO in that method you mast get old salary, minus old salary from totalSum set new rate and use getSalary() method, and that method add to totalSum new salary
    public int changeRate(int newRate) {
        this.newRate = newRate;
        return newRate * this.hours;
    }

    public double getBonuses() {
        return this.bonuses * getSalary();
    }

    //TODO return int value
    public double totalSum(ArrayList<Employee> employees) {
        double totalSum = 0;
        for (Employee employee : employees) {
            double salary = employee.getSalary();
            totalSum = totalSum + salary;
        }
        return totalSum;
    }

    //TODO delete next two method because you do not use that methods
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
