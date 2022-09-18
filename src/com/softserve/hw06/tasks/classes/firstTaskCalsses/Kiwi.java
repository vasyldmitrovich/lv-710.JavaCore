package com.softserve.hw06.tasks.classes.firstTaskCalsses;

public class Kiwi extends NonFlyingBird {

    public Kiwi(String name, boolean haveFlightFeathers, boolean haveKeel, boolean isTooHeavyToFly, byte layEggs) {
        super(name, haveFlightFeathers, haveKeel, isTooHeavyToFly, layEggs);
        setCouldFly();
    }
}
