package com.softserve.Enum;

public enum Animal {
    DOG("собака"), CAT, FROG("лягушка");

    private String translation;

    Animal (String translation) {
        this.translation = translation;
    }

    Animal() {

    }

    public String getTranslation (){
        return translation;
    }
}
