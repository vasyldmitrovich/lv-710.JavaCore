package com.softserve.hw07.task2;

public class Car extends GroundVehicle{
    private String model;

    public Car(String model, int passengers){
        this.model = model;
        setPassengers(passengers);
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    @Override
    public void drive(){
    }
}
