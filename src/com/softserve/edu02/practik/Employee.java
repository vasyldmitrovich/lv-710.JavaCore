package com.softserve.edu02.practik;

public class Employee {
    private String name;
    private int rate;
    private double hours;
    static double totalSum;

    public Employee() {
    }

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
        return rate * hours;
    }

    public String toString() {
        return "Employee {"
                + "name: " + name
                + ", rate: " + rate
                + ", hours: " + hours
                + "}";
    }

    public double chageRate(int rate) {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }

    public static void main(String[] args) {
        Employee em1 = new Employee("Kollin", 35, 14);
        Employee em2 = new Employee("Boby", 30, 15);
        Employee em3 = new Employee("Nick", 40, 12);

        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(em3.toString());
        System.out.println("Total salary of all employees: " + (em1.getSalary() + em2.getSalary() + em3.getSalary()));
        System.out.println(totalSum);
    }
}
