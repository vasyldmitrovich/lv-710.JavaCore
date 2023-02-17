package com.softserve.edu03.practik;

public class Employee {
    static double totalSum;
    private String name;
    private int rate;
    private double hours;
    private double salary;

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + rate * hours;
    }

    public Employee(Object ...readLine) {
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        salary = rate * hours;

        return salary;
    }

    public String toString() {
        return "Employee {"
                + "name: " + name
                + ", rate: " + rate
                + ", hours: " + hours
                + "}";
    }

    public void changeRate(int rate) {   // УВАГА!! що скажешь про цю частину коду?
        if (rate >= 0) {
            totalSum = totalSum - (this.rate - rate) * hours;   // віднімаємо різницю між вартістю години роботи
        }
        if (rate < 0) {
            System.out.println("Error");
        }
        this.rate = rate;   // тільки зараз перезаписуємо нову вартість роботи в обʼєкт
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }
}








