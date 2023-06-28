package com.softserve.edu07Interfaces.hw.SchemaOfClasses;

public class Car extends GroundVehicle{
    public String model;

    public Car() {
    }

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
    }
}
