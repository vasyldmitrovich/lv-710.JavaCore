package com.softserve.hw07.task2;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int floors, int passengers){
        this.floors = floors;
        setPassengers(passengers);
    }

    public int getFloors(){
        return floors;
    }

    public void setFloors(int floors){
        this.floors = floors;
    }

    @Override
    public void isSailing(){
    }
}
