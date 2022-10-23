package com.softserve.hw07.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(){
    }
    abstract public void fly();
    abstract public void land();
}
