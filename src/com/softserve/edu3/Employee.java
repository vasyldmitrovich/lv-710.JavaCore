package com.softserve.edu3;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static float totalSum = 0;


    
    public Employee(){
    }
    
    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        this.hours = 0;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    private void updateTotalSum(float sum) {
        totalSum += sum;
    }

    public static void getTotalSalary() {
        System.out.println("Total sum of salary is - " + totalSum);
    }

    public float getSalary() {
        float Salary = 0;//TODO do not correct naming variable must be lover case
        Salary = hours * rate;
        updateTotalSum(Salary);
        return Salary;
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    public double getBonus() {
        return 0.1 * getSalary();
    }

    @Override
    public String toString() {
        return "Employee " + name + " has worked for " + hours
                + " hours with " + rate
                + " rate and totally got " + getSalary();
    }

}
