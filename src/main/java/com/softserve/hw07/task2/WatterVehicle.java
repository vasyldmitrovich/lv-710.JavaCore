package com.softserve.hw07.task2;

public abstract class WatterVehicle extends Passengers implements Vehicle {

    public WatterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
