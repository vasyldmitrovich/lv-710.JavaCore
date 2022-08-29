package com.softserve.edu03;

public class Employee {
    private String name;
    private float rate;
    private int hours;
    private static float totalSum;

    public Employee() {

    }

    public Employee (String name, float rate){
        this.name = name;
        this.rate = rate;
    }

    public Employee (String name, float rate, int hours){
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

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getRate() {
        return this.rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }

    public float getSalary() {
        totalSum += this.rate * this.hours;
        return this.rate * this.hours;
    }

    @Override
    public String toString() {
        return getName() + "'s rate is " + getRate() + " USD/hour," +
                " he worked " + getHours() + " hours.";
    }

    public float changeRate(float rate){
        totalSum -= (this.rate * this.hours);
        this.rate = rate;
        getSalary();
        return this.rate;
    }

    public float getBonuses() {
        totalSum += this.rate * this.hours / 10;
        return this.rate * this.hours / 10;
    }

    public static float getTotalSum() {
        return totalSum;
    }
}
