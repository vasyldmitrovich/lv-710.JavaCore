package com.softserve.edu07.hw.SchemaOfClasses;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public void isSailing() {
    }
}