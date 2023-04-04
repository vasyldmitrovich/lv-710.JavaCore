package com.softserve.edu06.hw.Birds;

public class Swallow extends FlyingBirds {
    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "I am Swallow," + " My feathers is " + getFeathers() + ", I can lays " + getLayEggs() + " eggs";
    }
}
