package com.softserve.hw07.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    @Override
    public void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    public abstract void fly();

    public abstract void land();
}
