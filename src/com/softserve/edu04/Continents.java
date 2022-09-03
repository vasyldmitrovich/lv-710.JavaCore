package com.softserve.edu04;

public enum Continents {
    AFRICA("Sudan","Lebanon","Egypt"),
    EURASIA("Ukraine", "France", "Italy" ),
    NORTH_AMERICA("USA","Canada", "Mexico"),
    SOUTH_AMERICA("Peru", "Brasil", "Argentina"),
    ANTARCTICA("None"),
    AUSTRALIA("Australia");
    private final String[] country;

     Continents(String... args){
        this.country = args;
    }
    public  String[] getCountryName(){
        return country;
    }

}
