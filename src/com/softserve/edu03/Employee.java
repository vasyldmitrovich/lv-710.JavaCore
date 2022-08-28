package com.softserve.edu03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    private final String name;
    private double rate;
    private int hours;
    public static double totalSum=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Employee() throws IOException {
        System.out.println("Введіть імя працівника:");
        this.name= br.readLine();
        System.out.println("Введіть ставку:");
        this.rate = Double.parseDouble(br.readLine());
        System.out.println("Введіть к-сть годин:");
        this.hours = Integer.parseInt(br.readLine());
        //totalSum = totalSum + (this.rate*this.hours);
    }
    Employee(String name, double rate) throws IOException {
        this(name,rate,0);
        System.out.println("При додаванні пррацівника " + name + " не вказано к-сть годин, введіть її:");
        this.hours = Integer.parseInt(br.readLine());
    }
    Employee (String name, int hours) throws IOException {
        this(name,0.0,hours);
        System.out.println("При додаванні пррацівника " + name+ " не вказано ставку, введіть її:");
        this.rate = Double.parseDouble(br.readLine());
    }
    Employee (String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        //totalSum = totalSum + (this.rate*this.hours);
    }


    public double getSalary(){
        return rate * hours;
    }

    @Override
    public String toString(){
        return "Імя: " + this.name + ", ставка: " + this.rate + ", к-сть годин: " + this.hours;
    }

    public void addToTotalSum(){
        totalSum=totalSum+getSalary();
    }
    public double changeRate(int rate){
        this.rate = rate;
        return rate * hours;
    }

    public double getBonuses(){
        return rate * hours * 1.1;
    }

}
