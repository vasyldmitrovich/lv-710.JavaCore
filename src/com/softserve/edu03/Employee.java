package com.softserve.edu03;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static BigDecimal totalSum = BigDecimal.ZERO;

    public Employee() {
        totalSum = totalSum.add(BigDecimal.valueOf(this.rate).
                multiply(BigDecimal.valueOf(this.hours)));
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        totalSum = totalSum.add(BigDecimal.valueOf(this.rate).
                multiply(BigDecimal.valueOf(this.hours)));
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum.add(BigDecimal.valueOf(this.rate).
                multiply(BigDecimal.valueOf(this.hours)));
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
        else
            System.out.println("wrong data");
    }

    public void setRate(int rate) {
        if (rate > 0)
            this.rate = rate;
        else
            System.out.println("wrong data");
    }

    public void setHours(int hours) {
        if (hours > 0)
            this.hours = hours;
        else
            System.out.println("wrong data");
    }

    public BigDecimal getSalary() {
        BigDecimal empRate = new BigDecimal(rate);
        BigDecimal empHours = new BigDecimal(hours);
        return empRate.multiply(empHours);
    }

    public BigDecimal changeRate(int rate) {
        if (rate > 0) {
            totalSum = totalSum.subtract(BigDecimal.valueOf(this.rate).
                    multiply(BigDecimal.valueOf(this.hours)));
            this.rate = rate;
            totalSum = totalSum.add(BigDecimal.valueOf(this.rate).
                    multiply(BigDecimal.valueOf(this.hours)));
        } else {
            System.out.println("ERROR: method changeRate has wrong data");
        }
        return getSalary();
    }

    public BigDecimal getBonuses() {
        BigDecimal salary = new BigDecimal(String.valueOf(getSalary()));
        BigDecimal bonus = new BigDecimal("0.10");
        return salary.multiply(bonus);
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }

    @Override
    public String toString() {
        return "ID: '" + name + "\'" +
                ", rate: " + rate +
                ", hours: " + hours +
                ", salary: " + getSalary() +
                ", bonus: " + getBonuses() +
                ";";
    }
}
