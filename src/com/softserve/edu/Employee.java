package com.softserve.edu;

public class Employee {
    private String name;
    private long rate;
    private long hours;
    private static long totalSum;

    public Employee() {

    }

    public Employee (String name, long rate){
        this.name = name;
        this.rate = rate;
    }

    public Employee (String name, long rate, long hours){
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

    public void setRate(long rate) {
        this.rate = rate;
    }

    public long getRate() {
        return this.rate;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public long getHours() {
        return this.hours;
    }

    public long getSalary() {
        totalSum += this.rate * this.hours;
        return this.rate * this.hours;
    }

    @Override
    public String toString() {
        return getName() + "'s rate is " + getRate() + " USD/hour," +
                " he worked " + getHours() + " hours.";
    }

    public long changeRate(long rate){
        totalSum -= (this.rate * this.hours);
        this.rate = rate;
        getSalary();
        return this.rate;
    }

    public long getBonuses() {
        totalSum += this.rate * this.hours / 10;
        return this.rate * this.hours / 10;
    }

    public static long getTotalSum() {
        return totalSum;
    }
}
