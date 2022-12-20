package com.softserve.Enum;

import static com.softserve.Enum.Season.*;

public class TestSeason {
    public static void main(String[] args) {
        Season season = AUTUMN;
        Season season1 = AUTUMN;
        System.out.println(season.name() + " + " + season1.name());
        printSeason(WINTER);
        printValues();

        Season winter = valueOf("WINTER");
        System.out.println(winter);
    }

    public static void printSeason(Season season) {
        switch (season) {
            case AUTUMN:
                System.out.println("Its a AUTUMN");
                break;
            case SPRING:
                System.out.println("Its a SPRING");
                break;
            case SUMMER:
                System.out.println("Its a SUMMER");
                break;
            case WINTER:
                System.out.println("Its a WINTER");
                break;
        }
        System.out.println();
    }

    public static void printValues() {
//        Season[] seasons = Season.values();     // эту строчку мы упростили, ее можно не писать
        for (Season seas :
                Season.values()) {
            System.out.println(seas);
        }
        System.out.println();
    }
}


