package com.softserve.edu06.hw.Birds;

public class Kiwi extends NonFlyingBirds{
    public Kiwi(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "I am Kiwi," + " My feathers is " + getFeathers() + ", I can lays " + getLayEggs() + " eggs";
    }
}
