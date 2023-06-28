package com.softserve.edu07Interfaces.hw.SchemaOfClasses;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public void drive() {
    }

}
