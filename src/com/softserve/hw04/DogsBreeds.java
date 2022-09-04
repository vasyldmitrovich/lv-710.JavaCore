package com.softserve.hw04;

public enum DogsBreeds {
    LABRADOR_RETRIEVER("Labrador Retriever"),
    FRENCH_BULLDOG("French Bulldog"),
    GOLDEN_RETRIEVER("Golden Retriever"),
    GERMAN_SHEPHERD_DOG("German Shepherd Dog"),
    POODLE("Poodle");

    String breedName;

    DogsBreeds(String breedName){
        this.breedName = breedName;
    }

    public static String getBreedName(String breed){
        String result = null;
        for (DogsBreeds template : DogsBreeds.values()) {
            if (breed.equals(template.name())) {
                result = template.breedName;
            }
        }
        return result;
    }
}
