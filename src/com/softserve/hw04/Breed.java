package com.softserve.hw04;

public enum Breed {

    SHEPHERD("German Shepherd"),
    BERNARD("Saint Bernard"),
    DALMATAIN("Dalmatian");
    private final String dogBreed;

    Breed(String breed) {
        this.dogBreed = breed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

}
