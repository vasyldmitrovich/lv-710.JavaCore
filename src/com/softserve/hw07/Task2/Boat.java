package com.softserve.hw07.Task2;

public class Boat extends WaterVehicle{
    private int volume;
    public Boat(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
