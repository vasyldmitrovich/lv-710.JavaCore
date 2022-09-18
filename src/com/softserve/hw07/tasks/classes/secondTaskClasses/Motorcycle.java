package com.softserve.hw07.tasks.classes.secondTaskClasses;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    public Motorcycle() {

    }

    public Motorcycle(int maxSpeed, int passengers) {
        this.maxSpeed = maxSpeed;
        setPassengers(passengers);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {

    }
}
