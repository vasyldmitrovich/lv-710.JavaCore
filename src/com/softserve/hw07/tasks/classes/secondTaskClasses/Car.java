package com.softserve.hw07.tasks.classes.secondTaskClasses;

public class Car extends GroundVehicle{

    private String model;

    public Car() {

    }

    public Car(String model, int passengers) {
        this.model = model;
        setPassengers(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {

    }
}
