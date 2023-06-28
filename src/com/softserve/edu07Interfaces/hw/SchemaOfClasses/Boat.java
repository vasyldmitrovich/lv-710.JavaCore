package com.softserve.edu07Interfaces.hw.SchemaOfClasses;

public class Boat extends WaterVehicle {
    public int volume;

    public Boat() {
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
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
