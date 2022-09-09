package com.softserve.hw06.Birds;

public abstract class Bird {
    protected String name;
    protected boolean feathers, layEggs;
    protected boolean fly;

    public abstract void fly();

    public void print() {
        System.out.println("Hi, I am " + this.getClass().getSimpleName() + ", my name is " + name +
                ", I " + (this.fly ? "can" : "can't") + " fly," +
                "have" + (this.feathers ? "" : "n't") + " feathers, " +
                "and can" + (this.layEggs ? "" : "'t") + " lay eggs");
    }

}
