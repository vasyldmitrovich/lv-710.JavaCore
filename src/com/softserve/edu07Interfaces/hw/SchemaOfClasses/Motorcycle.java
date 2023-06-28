package com.softserve.edu07Interfaces.hw.SchemaOfClasses;

public class Motorcycle extends GroundVehicle{
    public int maxSpeed;

    public Motorcycle() {
    }

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        super.drive();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

