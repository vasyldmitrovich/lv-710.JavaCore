package com.softserve.hw07.task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight, int passengers){
        this.weight = weight;
        this.maxHeight = maxHeight;
        setPassengers(passengers);
    }
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getMaxHeight(){
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight){
        this.maxHeight=maxHeight;
    }

    @Override
    public void fly(){
    }

    @Override
    public void land(){
    }
}
