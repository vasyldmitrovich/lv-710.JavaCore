package com.softserve.edu03;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    //TODO move constructors to up and add setters, add totalSum variable and method

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public BigDecimal getSalary() {
        BigDecimal a = new BigDecimal(rate);
        BigDecimal b = new BigDecimal(hours);
        BigDecimal result = a.multiply(b);
        return result;
    }

    public BigDecimal changeRate(int rate) {
        this.rate = rate;
        return getSalary();
    }

    public BigDecimal getBonuses() {
        BigDecimal salary = new BigDecimal(String.valueOf(getSalary()));
        BigDecimal bonus = new BigDecimal("0.10");
        BigDecimal result = salary.multiply(bonus);
        return result;
    }

    @Override
    public String toString() {
        return "ID: '" + name + "\'" +
                ", rate: " + rate +
                ", hours: " + hours +
                ", salary: " + getSalary() +
                ", bonus: " + getBonuses();
    }
}
