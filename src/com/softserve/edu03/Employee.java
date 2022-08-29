package com.softserve.edu03;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee() {

    }

    public Employee (String name, double rate){
        this.name = name;
        this.rate = rate;
    }

    public Employee (String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }

    public double getSalary() {
        totalSum += this.rate * this.hours;
        return this.rate * this.hours;
    }

    @Override
    public String toString() {
        return getName() + "'s rate is " + getRate() + " USD/hour," +
                " he worked " + getHours() + " hours.";
    }

    public double changeRate(double rate){
        totalSum -= (this.rate * this.hours);
        this.rate = rate;
        getSalary();
        return this.rate;
    }

    public double getBonuses() {
        totalSum += this.rate * this.hours / 10;
        return this.rate * this.hours / 10;
    }

    public static double getTotalSum() {
        return totalSum;
    }
}
