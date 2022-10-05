package com.softserve.hw07.task2;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane(int maxDistance) {
        super(maxDistance);
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public void fly() {
    }

    @Override
    public void land() {
    }
}
