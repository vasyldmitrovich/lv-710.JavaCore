package com.softserve.edu3.employee;


public class Employee {
    private static double totalSum;
    private String name;
    private double rate;
    private double hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        totalSum += getSalary();
    }
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public void setRate(double rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -= getSalary();
        this.hours = hours;
        totalSum += getSalary();
    }

    public double getSalary() {
        return rate * hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    void changeRate(int rate) {
        setRate(rate);
        System.out.println("recalculate salary - " + getSalary());
    }


    void getBonuses() {
        double bonus = (0.1 * getSalary());
        totalSum += bonus;
        System.out.println("10% from salary - " + bonus);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
