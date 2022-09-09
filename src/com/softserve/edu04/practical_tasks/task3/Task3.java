package com.softserve.edu04.practical_tasks.task3;

import java.util.Arrays;
import java.util.Objects;

import static com.softserve.hw01.MessageHelper.*;

/**
 * Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
 */

public class Task3 {
    public static void runTask3() {
        writeMessage("Enter the name of the country:");
        String country = readStringMessage();
        getContinentByCountry(country);
    }

    private static void getContinentByCountry(String country) {
        Objects.requireNonNull(country);
        if ("Ukraine".equals(country)) {
            writeMessage("Україна – це Європа!!!");
            return;
        }

        Arrays.stream(Continent.values())
                .filter(continent -> continent.getCountries().contains(country))
                .findFirst()
                .ifPresentOrElse(continent -> writeMessage(continent.name()),
                        () -> writeMessage(country + " - is not found"));
    }
}
