package com.softserve.hw06.task1;

public abstract class Bird {
    private String type;
    private String feathers;
    private boolean layEggs;

    public String fly(){
        return ("Flying");
    };


    public Bird() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }


}
