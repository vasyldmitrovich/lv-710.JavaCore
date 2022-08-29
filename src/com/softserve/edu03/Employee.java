package com.softserve.edu03;

public class Employee {
    private String name = "";
    private double rate;
    private int hours;
    public static double totalSum;

    Employee() {
    }

    Employee(String name, double rate) {
        this(name, rate, 0);
    }

    Employee(String name, int hours) {
        this(name, 0.0, hours);
    }

    Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + this.name + '\'' +
                ", rate='" + this.rate + '\'' +
                ", hours='" + this.hours+ "'}'";
    }

    public void addToTotalSum() {
        totalSum = totalSum + getSalary();
    }

    public double changeRate(double rate) {
        setRate(rate);
        return rate;
    }

    public double getBonuses() {
        return rate * hours * 1.1;
    }

}
