package com.softserve.edu04Enum.practic;

// READY !!
public enum DaysOfWeek {
    SUNDAY(1, "неділя", "Sunday", "Dimanche"),
    MONDAY(2, "понеділок", "Monday", "Lundi"),
    TUESDAY(3, "вівторок", "Tuesday", "Mardi"),
    WEDNESDAY(4, "середа", "Wednesday", "Mercredi"),
    THURSDAY(5, "четвер", "Thursday", "Jeudi"),
    FRIDAY(6, "п’ятниця", "Friday", "Vendredi"),
    SATURDAY(7, "субота", "Saturday", "Samedi");


    private int numberOfWeek;
    private String ua;
    private String en;
    private String fr;

    DaysOfWeek() {
    }

    DaysOfWeek(int numberOfWeek, String ua, String en, String fr) {
        this.numberOfWeek = numberOfWeek;
        this.ua = ua;
        this.en = en;
        this.fr = fr;
    }

    public int getNumberOfWeek() {
        return numberOfWeek;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

    public String getFr() {
        return fr;
    }

    @Override
    public String toString() {
        return "number of Week: " + numberOfWeek +
                ", ua: '" + ua + '\'' +
                ", en: '" + en + '\'' +
                ", fr: '" + fr + '\'';
    }
}
