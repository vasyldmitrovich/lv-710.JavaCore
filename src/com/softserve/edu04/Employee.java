package com.softserve.edu04;

import java.util.ArrayList;

public class Employee {


    private String name;
    private int rate;
    private int hours;
    private int bonus = 0;

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
    }

    Employee(String name, int rate, int hours, int bonus) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.bonus = bonus;
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

    public int getSalary() {
        return this.rate * this.hours + this.bonus;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + "\n" +
                "Rate: " + getRate() + "\n" +
                "Hours: " + getHours() + "\n";
    }

    //TODO in that method you mast get old salary, minus old salary from totalSum set new rate and use getSalary() method, and that method add to totalSum new salary
//    public int changeRate(int rate) {
//        this.newRate = newRate;
//        return newRate * this.hours;
//    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    //TODO return int value
    public int totalSum(ArrayList<Employee> employees) {
        int totalSum = 0;
        for (Employee employee : employees) {
            int salary = employee.getSalary();
            totalSum = totalSum + salary;
        }
        return totalSum;
    }
}
