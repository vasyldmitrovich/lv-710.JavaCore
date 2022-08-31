package com.softserve.edu4.employee;

import lombok.*;


@Data
@NoArgsConstructor
public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        totalSum += getSalary();
    }
    public Employee(String name, double rate, double hours) {
        this(name, rate);
        this.hours = hours;
    }

    public void setRate(double rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
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

    //TODO when use that method, that method must rewrite totalSum variable
    void getBonuses() {
        System.out.println("10% from salary - " + (0.1 * getSalary()));
    }
}
