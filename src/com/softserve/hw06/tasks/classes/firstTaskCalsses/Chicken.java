package com.softserve.hw06.tasks.classes.firstTaskCalsses;

public class Chicken extends NonFlyingBird {

    public Chicken(String name, boolean haveFlightFeathers, boolean haveKeel, boolean isTooHeavyToFly, byte layEggs) {
        setName(name);
        setHaveFlightFeathers(haveFlightFeathers);
        setHaveKeel(haveKeel);
        setTooHeavyToFly(isTooHeavyToFly);
        setLayEggs(layEggs);
        setCouldFly();
    }

}
