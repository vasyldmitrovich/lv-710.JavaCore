package com.softserve.hw06.task1;

public abstract class Bird {
    private boolean feathers = true;
    private boolean layEggs = true;

    public Bird() {
    }

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": feathers - " + isFeathers() +
                ", lay eggs - " + isLayEggs();
    }

    public abstract void fly();
}
