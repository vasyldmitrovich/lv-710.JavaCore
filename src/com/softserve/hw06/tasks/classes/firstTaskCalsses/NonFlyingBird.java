package com.softserve.hw06.tasks.classes.firstTaskCalsses;

import com.softserve.hw06.tasks.classes.firstTaskCalsses.Bird;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String name, boolean haveFlightFeathers, boolean haveKeel, boolean isTooHeavyToFly, byte layEggs) {
        super(name, haveFlightFeathers, haveKeel, isTooHeavyToFly, layEggs);
    }

    @Override
    public String fly() {
        String result;
        if (isCouldFly()){
            result = getName() + " is flying";
        } else {
            result = getName() + " couldn't fly =(";
        }
        return result;
    }

    @Override
    public String toString(){
        return fly() + ", and could lay " + getLayEggs() + " eggs";
    }

}
