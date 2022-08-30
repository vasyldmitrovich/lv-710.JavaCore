package com.softserve.edu4;

import lombok.*;

import java.util.concurrent.ThreadLocalRandom;

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

    public static double getTotalSum() {
        return totalSum;
    }

    double getSalary() {
        return rate * hours;
    }

    void changeRate(int rate) {
        setRate(rate);
        System.out.println("recalculate salary - " + getSalary());
    }

    void getBonuses() {
        System.out.println("10% from salary - " + (0.1 * getSalary()));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3;) {
            Employee employee = new Employee("employee" + (++i),
                    ThreadLocalRandom.current().nextInt(10_000, 20_000),
                    ThreadLocalRandom.current().nextInt(100, 172));

            System.out.println(employee);
            System.out.println(employee.getSalary());
            employee.getBonuses();
            System.out.println("totalSum: " + Employee.getTotalSum());
            System.out.println("________________________________");
        }
    }
}
