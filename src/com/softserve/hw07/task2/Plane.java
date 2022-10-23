package com.softserve.hw07.task2;

public class Plane extends FlyingVehicle{
    private int maxDistanse;
    public Plane(int maxDistanse, int passengers){
        this.maxDistanse = maxDistanse;
        setPassengers(passengers);
    }
    public int getMaxDistanse(){
        return maxDistanse;
    }
    public void setMaxDistanse(int maxDistanse){
        this.maxDistanse = maxDistanse;
    }

    @Override
    public void fly(){
    }

    @Override
    public void land(){
    }
}
