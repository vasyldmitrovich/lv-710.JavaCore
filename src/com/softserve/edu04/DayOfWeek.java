package com.softserve.edu04;

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

}
