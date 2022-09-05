package com.softserve.edu04;

import java.io.IOException;
import com.softserve.hw03.InputReader;

public enum DayOfWeek {
    MONDAY("monday", "montag", "понеділок"),
    TUESDAY("tuesday", "dienstag", "вівторок"),
    WEDNESDAY("wednesday", "mittwoch", "середа"),
    THURSDAY("thursday", "donnerstag", "четвер"),
    FRIDAY("friday", "freitag", "пятниця"),
    SATURDAY("saturday", "samstag", "субота"),
    SUNDAY("sunday", "sonntag", "неділя");

    private final String en;
    private final String de;
    private final String ua;

    DayOfWeek(String en, String de, String ua) {
        this.en = en;
        this.de = de;
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public String getDe() {
        return de;
    }

    public String getUa() {
        return ua;
    }

    private static DayOfWeek getDayNumber() throws IOException {
        int userInput;
        System.out.print("Enter day number: ");
        userInput = InputReader.getInputInt();

        switch (userInput) {
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                System.out.println("wrong data");
        }
        return getDayNumber();
    }

    public static void getDayName() throws IOException {
        DayOfWeek a = getDayNumber();
        System.out.println(a.getEn());
        System.out.println(a.getDe());
        System.out.println(a.getUa());
    }
}
