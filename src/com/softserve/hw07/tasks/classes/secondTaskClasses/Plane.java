package com.softserve.hw07.tasks.classes.secondTaskClasses;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane() {

    }

    public Plane(int maxDistance, int passengers) {
        this.maxDistance = maxDistance;
        setPassengers(passengers);
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
