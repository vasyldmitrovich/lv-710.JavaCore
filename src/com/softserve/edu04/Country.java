package com.softserve.edu04;

public enum Country {
    NORWAY(Continent.EURASIA),
    UKRAINE(Continent.EURASIA),
    BRAZIL(Continent.SOUTH_AMERICA),
    CANADA(Continent.NORTH_AMERICA),
    AUSTRALIA(Continent.AUSTRALIA),
    KENYA(Continent.AFRICA);

    public Continent getContinent() {
        return continent;
    }


    private final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}
