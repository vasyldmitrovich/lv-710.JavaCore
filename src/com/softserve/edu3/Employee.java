package com.softserve.edu3;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static float totalSum = 0;

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    private void updateTotalSum(float sum){
        totalSum += sum;
    }

    public static void getTotalSalary(){
        System.out.println("Total sum of salary is - " + totalSum);
    }

}
