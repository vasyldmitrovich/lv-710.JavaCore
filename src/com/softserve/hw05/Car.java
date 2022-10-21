package com.softserve.hw05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Car implements Comparable<Car> {
    String type;
    int yearOfProduction;
    double engineCapacity;
    //Car[] cars;


    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void displayByYear(int year){
            if (year == yearOfProduction) {
                System.out.println(toString());
            }
    }
    @Override
    public String toString() {
        return "Type: " + type + "\n" + "Year of production: " +yearOfProduction + "\n" +
                "Engine Capacity: " + engineCapacity + "\n";
    }

    @Override
    public int compareTo(Car o) {
        return this.yearOfProduction-o.getYearOfProduction();
    }
}



