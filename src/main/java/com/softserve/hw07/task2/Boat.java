package com.softserve.hw07.task2;

public class Boat extends  WatterVehicle{

    private int volume;

    public Boat(int volume) {
        super(volume);
        this.volume = volume;
    }

    @Override
    public void isSailing() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
