package com.softserve.hw05.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.softserve.hw01.MessageHelper.readIntMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Create class Car with fields type, year of production and engine capacity.
 * Create and initialize four instances of class Car. Display cars
 * - certain model year  (enter year in the console);
 * - ordered by the field year.
 */
public class Task4 {
    public static void runTask4() {
        List<Car> cars = new ArrayList<>() {{
            add(new Car(CarType.TRUCK, 1996, 2000));
            add(new Car(CarType.MINIVAN, 2002, 1800));
            add(new Car(CarType.CROSSOVER, 2015, 2500));
            add(new Car(CarType.SPORTS_CAR, 1982, 3700));
        }};

        int year = readIntMessage();
        writeMessage("Search results by " + year + " year:");
        cars.stream()
                .filter(car -> car.getYearOfProduction() == year)
                .forEach(System.out::println);

        writeMessage("______________________________");

        writeMessage("List of cars sorted by year:");
        cars.stream()
                .sorted(Comparator.comparing(Car::getYearOfProduction))
                .forEach(System.out::println);
    }
}