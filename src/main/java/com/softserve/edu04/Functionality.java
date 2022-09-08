package com.softserve.edu04;

import java.util.Scanner;

import static com.softserve.edu04.CountriesAndContinent.*;

public class Functionality {

    public void getCountry(CountriesAndContinent location) {
        switch (location) {
            case UKRAINE:
                System.out.println("This country situated in " + UKRAINE.getLocation());
                break;
            case ENGLAND:
                System.out.println("This country situated in " + ENGLAND.getLocation());
                break;
            case USA:
                System.out.println("This country situated in " + USA.getLocation());
                break;
            case CANADA:
                System.out.println("This country situated in " + CANADA.getLocation());
                break;
            case JAPAN:
                System.out.println("This country situated in " + JAPAN.getLocation());
                break;
            case SOUTH_KOREA:
                System.out.println("This country situated in " + SOUTH_KOREA.getLocation());
                break;
        }
    }

    public CountriesAndContinent stringToEnum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Input country name: ");
        String countryInput = s.next();
        CountriesAndContinent country = CountriesAndContinent.valueOf(countryInput.toUpperCase());
        return country;
    }
}
