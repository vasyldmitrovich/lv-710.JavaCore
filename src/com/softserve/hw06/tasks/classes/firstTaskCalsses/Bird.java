package com.softserve.hw06.tasks.classes.firstTaskCalsses;

abstract public class Bird {

    private String name;
    private boolean haveFlightFeathers;
    private boolean haveKeel;
    private boolean isTooHeavyToFly;
    private byte layEggs;
    private boolean couldFly;

    public Bird(String name, boolean haveFlightFeathers, boolean haveKeel, boolean isTooHeavyToFly, byte layEggs) {
        this.name = name;
        this.haveFlightFeathers = haveFlightFeathers;
        this.haveKeel = haveKeel;
        this.isTooHeavyToFly = isTooHeavyToFly;
        this.layEggs = layEggs;
    }

    public void setCouldFly() {
        if (haveFlightFeathers & haveKeel & !isTooHeavyToFly){
            couldFly = true;
        } else couldFly = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHaveFlightFeathers(boolean haveFlightFeathers) {
        this.haveFlightFeathers = haveFlightFeathers;
    }

    public void setHaveKeel(boolean haveKeel) {
        this.haveKeel = haveKeel;
    }

    public void setTooHeavyToFly(boolean tooHeavyToFly) {
        isTooHeavyToFly = tooHeavyToFly;
    }

    public void setLayEggs(byte layEggs) {
        this.layEggs = layEggs;
    }

    public String getName() {
        return name;
    }

    public boolean isCouldFly() {
        return couldFly;
    }

    public byte getLayEggs() {
        return layEggs;
    }

    abstract public String fly();

}
