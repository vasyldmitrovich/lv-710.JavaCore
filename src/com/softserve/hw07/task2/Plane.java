package com.softserve.hw07.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
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
