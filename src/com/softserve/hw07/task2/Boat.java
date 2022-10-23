package com.softserve.hw07.task2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int volume, int passengers){
        this.volume = volume;
        setPassengers(passengers);
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume=volume;
    }

    @Override
    public void isSailing(){
    }
    
}
