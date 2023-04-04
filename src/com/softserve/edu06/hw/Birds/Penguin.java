package com.softserve.edu06.hw.Birds;

public class Penguin extends NonFlyingBirds {
    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "I am Penguin," + " My feathers is " + getFeathers() + ", I can lays " + getLayEggs() + " eggs";
    }
}
