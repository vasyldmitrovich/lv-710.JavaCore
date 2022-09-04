package com.softserve.edu04;

public enum CountriesAndContinent {

    NORTH_AMERICA("North America"),
    EUROPE("Europe"),
    ASIA("Asia"),

    UKRAINE("Ukraine") {
        @Override
        public String getLocation() {
            return EUROPE.location;
        }
    },
    ENGLAND("England") {
        @Override
        public String getLocation() {
            return EUROPE.location;
        }
    },
    USA("USA") {
        @Override
        public String getLocation() {
            return NORTH_AMERICA.location;
        }
    },
    CANADA("Canada") {
        @Override
        public String getLocation() {
            return NORTH_AMERICA.location;
        }
    },
    JAPAN("Japan") {
        @Override
        public String getLocation() {
            return ASIA.location;
        }
    },
    SOUTH_KOREA("South Korea") {
        @Override
        public String getLocation() {
            return ASIA.location;
        }
    };

    private String location;

    private CountriesAndContinent(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }
}
