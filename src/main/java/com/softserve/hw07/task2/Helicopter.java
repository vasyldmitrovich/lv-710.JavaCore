package com.softserve.hw07.task2;

public class Helicopter extends FlyingVehicle {

    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        super(weight);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
    }

    @Override
    public void land() {
    }
}
