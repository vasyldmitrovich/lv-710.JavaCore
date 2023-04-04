package com.softserve.edu06.hw.Birds;

public class Eagle extends FlyingBirds{
    @Override
    public String toString() {
        return "I am Eagle," + " My feathers is " + getFeathers() + ", I can lays " + getLayEggs() + " eggs";
    }

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);

    }
}
