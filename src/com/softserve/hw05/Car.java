package com.softserve.hw05;

import java.util.Comparator;

public class Car {

    private int yearOfProduction;
    private double engineCapacity;
    private String carType;

    public Car() {
    }

    public Car(int yearOfProduction, double engineCapacity, String carType) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.carType = carType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public static Comparator<Car> compareYear = (c1, c2) -> {
        int yearProd1 = c1.getYearOfProduction();
        int yearProd2 = c2.getYearOfProduction();

        // for ascending order
        return yearProd1 - yearProd2;

        // for descending order
        // return rollno2 - rollno1;
    };


    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", carType='" + carType + '\'' +
                '}';
    }

}
