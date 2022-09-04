package com.softserve.hw04;

public enum Breed {

    LABRADOR_RETRIEVER("Labrador Retriever"),
    GERMAN_SHEPHERD("German Shepherd"),
    HUSKY("Husky");

    private String breed;

    private Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }
}
