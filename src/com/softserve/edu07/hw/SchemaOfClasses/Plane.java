package com.softserve.edu07.hw.SchemaOfClasses;

public class Plane extends FlyingVehicle {
    public int maxDistance;

    public Plane() {
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
    }

    @Override
    public void land() {
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
