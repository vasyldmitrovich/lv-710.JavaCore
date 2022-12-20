package com.softserve.Inheritance.Casting;

public class HeaveBox extends Box implements InterHeaveBox {
    private Double weight;

    public HeaveBox(Double weight) {
        this.weight = weight;
    }

    public HeaveBox() {
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
