package com.softserve.hw05.tasks.classes;

public class Car {
    private String type;
    private int yearOfProduction;
    private float engineCapacity;

    public Car() {

    }

    public Car(String type, int yearOfProduction, float engineCapacity){
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }
}
