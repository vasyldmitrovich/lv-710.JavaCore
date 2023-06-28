package com.softserve.edu04Enum.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

import static com.softserve.edu04Enum.practic.Continents.*;

public class ContinentsDemo {
    public static void returnContinent() throws IOException {
        String str = showMessageAndReturnInputData("Print name of country");
        Continents[] continents = new Continents[]{
                EUROPE, ASIA, NORTHAMERICA, SOUTHAMERICA, OCEANIA, AFRICA, ANTARCTICA};
        for (Continents cont :
                continents) {
            for (String country :
                    cont.getCountries()) {
                {
                    if (Objects.equals(str, country)) {
                        System.out.println(cont.name());
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Error. There is no such country");
    }

    public static String showMessageAndReturnInputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        returnContinent();
    }
}