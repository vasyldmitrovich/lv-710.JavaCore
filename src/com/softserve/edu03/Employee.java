package com.softserve.edu03;

public class Employee {
    private static double totalSum;
    private int hours;
    private String name;
    private double rate;

    public Employee(int hours, String name, double rate) {
        this.hours = hours;
        this.rate = rate;
        this.name = name;
        totalSum = getTotalSum() + this.getSalary();

    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee() {

    }


    public static double getTotalSum() {
        return totalSum;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return rate * hours;
    }

    public String toString() {
        return "Employee name " + name + " has rate: " + rate + " and works: " + hours + " hours.";
    }

  public void changeRate(double rate) {
      this.rate = rate;
  }
  public double getBonuses() {
        double salary = this.getSalary();
        double bonus = salary / 10;
        return bonus;
  }

}
