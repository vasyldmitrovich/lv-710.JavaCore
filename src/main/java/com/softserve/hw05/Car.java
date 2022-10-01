package com.softserve.hw05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Car {

    Scanner set = new Scanner(System.in);

    private String carType;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
    }

    public Car(String carType, int yearOfProduction, double engineCapacity) {
        this.carType = carType;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int setYearOfProduction() {
        System.out.println("Please input car year...");
        return this.yearOfProduction = set.nextInt();
    }

    public String setCarType() {
        System.out.println("Please input car year...");
        return this.carType;
    }

    public String getCarType(){
        return this.carType;
    }

    public int getYearOfProduction(){
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }

    @Override
    public String toString() {
        return getCarType() + " - " +
                getYearOfProduction() + " - " +
                getEngineCapacity();
    }

    public ArrayList<Car> sortByYear(ArrayList<Car> cars){
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYearOfProduction() - o2.getYearOfProduction();
            }
        });
        for (Car car1: cars){
            System.out.println(car1);
        }
        return cars;
    }
}
