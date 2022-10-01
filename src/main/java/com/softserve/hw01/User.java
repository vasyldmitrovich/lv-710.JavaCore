package com.softserve.hw01;

public class User {

    private int costPerMin;
    private int minutesAmount;
    private String name;
    public User(String name, int cost, int min) {
        this.name = name;
        this.costPerMin = cost;
        this.minutesAmount = min;
    }

    public int getCostPerMin() {
        return costPerMin;
    }

    public int getMinutesAmount() {
        return minutesAmount;
    }

    public String getName() {
        return name;
    }
}
