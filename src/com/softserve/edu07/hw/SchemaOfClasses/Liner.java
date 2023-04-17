package com.softserve.edu07.hw.SchemaOfClasses;

public class Liner extends WaterVehicle {
    public int floors;

    public Liner() {
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
