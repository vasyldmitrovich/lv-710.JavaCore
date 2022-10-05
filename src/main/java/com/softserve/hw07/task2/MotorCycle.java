package com.softserve.hw07.task2;

public class MotorCycle extends GroundVehicle {

    private int maxSpeed;

    public MotorCycle(int maxSpeed) {
        super(maxSpeed);
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
