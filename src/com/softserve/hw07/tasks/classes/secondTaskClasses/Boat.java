package com.softserve.hw07.tasks.classes.secondTaskClasses;

public class Boat extends WaterVehicle{

    private int volume;

    public Boat() {

    }

    public Boat(int volume, int passengers) {
        this.volume = volume;
        setPassengers(passengers);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {

    }
}
