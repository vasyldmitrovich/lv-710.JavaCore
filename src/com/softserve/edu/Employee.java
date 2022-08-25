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

    public long getSalary() {
        return this.rate * this.hours;
    }

    public String methodToString() {
        return "Name of employee is " + this.name + ", his rate is " + this.rate + " USD/hour," +
                " he worked " + this.hours + " hours.";
    }
}
