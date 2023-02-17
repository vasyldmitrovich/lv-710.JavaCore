package com.softserve.edu04.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

import static com.softserve.edu04.practic.Continents.*;


public class ContinentsDemo {

    public static void returnContinent() throws IOException {

        Continents europe = EUROPE;
        Continents asia = ASIA;
        Continents northAmerica = NORTHAMERICA;
        Continents southAmerica = SOUTHAMERICA;
        Continents oceania = OCEANIA;
        Continents africa = AFRICA;
        Continents antarctica = ANTARCTICA;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();

        Continents[] continents = new Continents[]{
                europe, asia, northAmerica, southAmerica, oceania, africa, antarctica, southAmerica
        };
        for (Continents cont :
                continents) {
            for (String country :
                    cont.getCountries()) {
                {
                    if (Objects.equals(count, country)) {
                        System.out.println(cont.name());
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Error. There is no such country");
    }

    public static void main(String[] args) throws IOException {
        returnContinent();
        System.out.println();
    }
}