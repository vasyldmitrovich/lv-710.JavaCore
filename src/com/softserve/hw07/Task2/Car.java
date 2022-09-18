package com.softserve.hw07.Task2;

public class Car extends GroundVehicle{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    void drive() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
